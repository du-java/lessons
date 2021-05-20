package lesson27.proxy;

import lombok.AllArgsConstructor;

@Handler(invocationHandler = CustomHandler.class)
@AllArgsConstructor
public class CustomHandlerProxySimpleClass implements SimpleClass {

    private String message;

    @Override
    public void print() {
        System.out.println(message);
    }
}
