package lesson47;

import java.util.Objects;
import java.util.concurrent.*;

public class App06 {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newCachedThreadPool();
        final Future<Integer> future1 = executor.submit(new Calc());
        final Future<Integer> future2 = executor.submit(new Calc());

        try {
            final Integer integer1 = future1.get();
            final Integer integer2 = future2.get();
            System.out.println(Objects.equals(integer1, integer2));

            executor.submit(new Calc3());

            final Future<Integer> future3 = executor.submit(new Calc2());
            final Integer integer = future3.get();

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }


    }
}

class Calc implements Callable<Integer> {
    public int calc() {
        int tmp = 1;
        for (int i = 1; i < 20; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tmp *= i;
        }
        return tmp;
    }

    @Override
    public Integer call() throws Exception {
        return calc();
    }
}

class Calc2 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        throw new IllegalArgumentException();
    }
}

class Calc3 implements Runnable {

    public void run() {
        throw new IllegalArgumentException();
    }
}
