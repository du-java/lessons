package lesson27;

import lesson27.proxy.*;

import java.util.Arrays;

public class AppProxy {
    public static void main(String[] args) {
        final SimpleClass obj1 = ProxyFactory.getProxyInstanceOf(NonAnnotatedSimpleClass.class, NonAnnotatedSimpleClass.class.getSimpleName());
        final SimpleClass obj2 = ProxyFactory.getProxyInstanceOf(DefaultHandlerProxySimpleClass.class, DefaultHandlerProxySimpleClass.class.getSimpleName());
        final SimpleClass obj3 = ProxyFactory.getProxyInstanceOf(CustomHandlerProxySimpleClass.class, CustomHandlerProxySimpleClass.class.getSimpleName());

        System.out.println("------------------------------");
        Arrays.asList(obj1, obj2, obj3)
                .forEach(SimpleClass::print);
        System.out.println("------------------------------");
        obj2.print();
        System.out.println("------------------------------");
    }
}
