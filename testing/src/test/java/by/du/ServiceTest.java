package by.du;

import org.junit.jupiter.api.*;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

class ServiceTest {

    private Dao<Object> dao;

    @BeforeAll

    static void beforeAll() {
        System.out.println("before all test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all test");
    }

    @BeforeEach
    @SuppressWarnings("unchecked")
    void beforeEach() {
        System.out.println("before each test");
        dao = Mockito.mock(Dao.class);
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each test");
    }


    @Test
    void read() {
        Object value = new Object();
        when(dao.read(eq(1))).thenReturn(value);
        Service testObject = new Service(dao);
        Object result = testObject.read(1);
        assertEquals(value, result);
    }

    @Test
    void read_2() {
        Object value = new Object();
        when(dao.read(eq(2))).thenReturn(value);
        Service testObject = new Service(dao);
        Object result = testObject.read(1);
        assertNull(result);
    }

    @Test
    void read_3() {
        Object expected = new Object();
        when(dao.read(anyInt())).thenReturn(expected);
        Service testObject = new Service(dao);
        Object result = testObject.read(1);
        assertEquals(expected, result);
        verify(dao, atLeastOnce()).read(anyInt());
        verify(dao, times(1)).read(anyInt());
    }

    @Test
    void read_4() {
        Object expected = new Object();
        Object firstValue = new Object();
        when(dao.read(anyInt()))
                .thenReturn(firstValue)
                .thenReturn(expected);

        Service testObject = new Service(dao);
        Object result = testObject.readTwice(1);
        assertEquals(expected, result);
        assertNotEquals(firstValue, result);
        verify(dao, atLeastOnce()).read(anyInt());
        verify(dao, times(2)).read(anyInt());
    }

    @Test
    void read_5() {
        when(dao.read(anyInt()))
                .thenThrow(new IllegalArgumentException());

        Service testObject = new Service(dao);

        assertThrows(IllegalStateException.class, () -> testObject.readTwice(1));
    }

    @Test
    void save() {
        doNothing().when(dao).save(any());
        Service testObject = new Service(dao);
        testObject.save(new Object());
        verify(dao, times(1)).save(any());
    }

    @Test
    void save1() {
        doThrow(new IllegalArgumentException()).when(dao).save(any());
        Service testObject = new Service(dao);

        assertThrows(IllegalArgumentException.class, () -> testObject.save(new Object()));

        verify(dao, times(1)).save(any());
    }

    @Test
    void timeout() {
        assertTimeout(Duration.ofSeconds(3), () -> new Service(dao).read());
    }

    @Test
    void save_captor() {
        doNothing().when(dao).save(any());
        Service testObject = new Service(dao);
        Object expected = new Object();
        testObject.save(expected);

        ArgumentCaptor<Object> captor = ArgumentCaptor.forClass(Object.class);

        verify(dao, times(1)).save(captor.capture());
        assertEquals(expected, captor.getValue());
    }
}