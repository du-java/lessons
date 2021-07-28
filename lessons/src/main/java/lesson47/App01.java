package lesson47;

public class App01 {
    public static void main(String[] args) throws InterruptedException {

        final MyThread myThread = new MyThread();
        myThread.setName("myThread");

        final Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.setName("myRunnable");

        myThread.start();
        myRunnable.start();

        myRunnable.join();
        System.out.println("myRunnable ends");
        myThread.join();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
