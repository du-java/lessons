package lesson27.proxy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NonAnnotatedSimpleClass implements SimpleClass {

    private String message;

    @Override
    public void print() {
        System.out.println(message);
    }
}
