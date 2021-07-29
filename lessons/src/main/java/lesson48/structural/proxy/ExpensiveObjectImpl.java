package lesson48.structural.proxy;

import lombok.SneakyThrows;

public class ExpensiveObjectImpl implements ExpensiveObject {

    public ExpensiveObjectImpl() {
        longInit();
    }

    @Override
    @SneakyThrows
    public void process() {
        System.out.println("process started");
        Thread.sleep(1000);
        System.out.println("process completed");
    }


    @SneakyThrows
    private void longInit() {
        System.out.println("init start");
        Thread.sleep(5000);
        System.out.println("init end");
    }
}