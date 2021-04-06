package lesson16;

import java.util.*;

public class CustomArrayList<T> implements List<T> {

    private Object[] array;
    private int size;

    public CustomArrayList(int size) {
        this.array = new Object[size];
        this.size = 0;
    }

    public CustomArrayList() {
        this(10);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(o)) return true;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {
            private int index = -1;

            @Override
            public boolean hasNext() {
                return index + 1 < size;
            }

            @Override
            public T next() {
                return (T) array[++index];
            }

            @Override
            public void remove() {
                del(index);
            }
        };
        return iterator;
    }

    @Override
    public Object[] toArray() {
        return array;
    }

    @Override
    public boolean add(Object o) {
        checkCapacity();
        array[size++] = o;
        return true;
    }

    private void checkCapacity() {
        if (size + 1 > array.length) {
            Object[] temp = new Object[array.length * 2];

            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)) {
                del(i);
                return true;
            }
        }
        return false;
    }

    private Object del(int index) {
        size--;
        Object o = array[index];
        if (index + 1 == array.length) return o;
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        return 0;
    }

    @Override
    public boolean addAll(Collection c) {
        int initSize = size;
        for (Object obj : c) {
            add(obj);
        }
        return initSize != size;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        int initSize = size;
        for (Object obj : c) {
            add(index++, obj);
        }
        return initSize != size;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public T set(int index, Object element) {
        Object o = array[index];
        array[index] = element;
        return (T) o;
    }

    @Override
    public void add(int index, Object element) {
        checkCapacity();
        for (int i = size; i > index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
    }

    @Override
    public T remove(int index) {
        return (T) del(index);
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size; i > 0; i++) {
            if (array[i] != null && array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        List<T> subList = new CustomArrayList<>(toIndex - fromIndex);
        for (int i = fromIndex; i < toIndex; i++) {
            subList.add((T) array[i]);
        }
        return subList;
    }

    @Override
    public boolean retainAll(Collection c) {
        int initSize = size;
        for (int i = 0; i < size; i++) {
            if (!c.contains(array[i])) {
                del(i);
            }
        }
        return initSize != size;
    }

    @Override
    public boolean removeAll(Collection c) {
        int initSize = size;
        for (Object o : c) {
            remove(o);
        }
        return initSize != size;
    }

    @Override
    public boolean containsAll(Collection c) {
        for (Object o : c) {
            if (!contains(o)) return false;
        }
        return true;
    }

    @Override
    public T[] toArray(Object[] a) {
        return (T[]) array;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(array[i]);
            if (i + 1 < size) {
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.append(")").toString();
    }
}
