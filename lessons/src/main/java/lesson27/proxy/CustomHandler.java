package lesson27.proxy;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

public class CustomHandler implements InvocationHandler {

    private final Object object;

    public CustomHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        final Optional<Field> first = Arrays.stream(object.getClass().getDeclaredFields())
                .findFirst();
        if (first.isPresent()) {
            final Field field = first.get();
            final boolean isAccessible = field.isAccessible();
            field.setAccessible(true);
            final Object value = field.get(object);
            field.set(object,
                    object.getClass().getAnnotation(Handler.class).invocationHandler().getSimpleName() + "#" + value.toString()
            );
            field.setAccessible(isAccessible);
        }
        return method.invoke(object, args);
    }
}
