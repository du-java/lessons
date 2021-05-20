package lesson27.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DefaultHandler implements InvocationHandler {

    private final Object object;

    public DefaultHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print(object.getClass().getAnnotation(Handler.class).invocationHandler().getSimpleName() + "*");
        return method.invoke(object, args);
    }
}
