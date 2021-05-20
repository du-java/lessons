package lesson27.proxy;

import lombok.AllArgsConstructor;

@Handler
@AllArgsConstructor
public class DefaultHandlerProxySimpleClass implements SimpleClass {

    private String message;

    @Override
    public void print() {
        System.out.println(message);
    }
}
