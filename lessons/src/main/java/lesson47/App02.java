package lesson47;

public class App02 {
    public static void main(String[] args) {
        final MyThread1 myThread1 = new MyThread1();
        final Thread thread = new Thread(myThread1);
        thread.start();

        System.out.println("Ver 1");
        try {
            Thread.sleep(1100);
            myThread1.disable();
            Thread.sleep(1000);
        } catch (InterruptedException ex) {

        }

        final MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        System.out.println("Ver 2");
        try {
            Thread.sleep(500);
            myThread2.interrupt();
            Thread.sleep(150);
        } catch (InterruptedException ex) {
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter = 1;
        while (!this.isInterrupted()) {
            System.out.println("Loop " + counter++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}

class MyThread1 implements Runnable {

    private boolean isActive;

    void disable() {
        isActive = false;
    }

    MyThread1() {
        isActive = true;
    }

    public void run() {

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter = 1;
        while (isActive) {
            System.out.println("Loop " + counter++);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}