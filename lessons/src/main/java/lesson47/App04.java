package lesson47;

public class App04 {
    public static void main(String[] args) {
        System.out.println("Start");
        final Store store = new Store();
        final Consumer consumer1 = new Consumer(store);
        final Consumer consumer2 = new Consumer(store);
        final Producer producer1 = new Producer(store);
        final Producer producer2 = new Producer(store);
        final Thread c1 = new Thread(consumer1);
        c1.setName("c1");
        final Thread c2 = new Thread(consumer2);
        c2.setName("c2");
        final Thread p1 = new Thread(producer1);
        p1.setName("p1");
        final Thread p2 = new Thread(producer2);
        p2.setName("p2");

        p1.start();
        c2.start();
        c1.start();
        p2.start();
    }
}

class Store {
    private int prod = 0;

    public synchronized void get() {
        while (prod < 1) {
            System.out.println("sleep " + Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        prod--;
        System.out.println("minus 1 prod");
        prn();
        notifyAll();
    }

    public synchronized void put() {
        while (prod >= 3) {
            try {
                System.out.println("sleep " + Thread.currentThread().getName());
                wait();
            } catch (InterruptedException e) {
            }
        }
        prod++;
        System.out.println("plus 1 prod");
        prn();
        notifyAll();
    }

    private void prn() {
        System.out.println("count " + prod);
    }
}

class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            store.put();
        }
    }
}

class Consumer implements Runnable {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            store.get();
        }
    }
}
