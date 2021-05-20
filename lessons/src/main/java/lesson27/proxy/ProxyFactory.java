package lesson27.proxy;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    @SuppressWarnings("unchecked")
    @SneakyThrows
    public static <T> T getProxyInstanceOf(Class<? extends T> type, String msg) {
        if (type == null) {
            throw new IllegalArgumentException("type can't be null");
        }

//        try {
            final Constructor<?> objectConstructor = type.getConstructor(String.class);
            Object instance = objectConstructor.newInstance(msg);

            if (type.isAnnotationPresent(Handler.class)) {
                final Class<?> invocationHandlerClass = type.getAnnotation(Handler.class).invocationHandler();
                final Constructor<?> handlerConstructor = invocationHandlerClass.getConstructor(Object.class);
                final InvocationHandler handler = (InvocationHandler) handlerConstructor.newInstance(instance);

                final Object proxy = Proxy.newProxyInstance(
                        type.getClassLoader(),
                        type.getInterfaces(),
                        handler
                );

                instance = proxy;
            }

            return (T) instance;
//        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
//            throw new IllegalArgumentException(e);
//        }
    }


}
