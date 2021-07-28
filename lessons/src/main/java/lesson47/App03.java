package lesson47;

public class App03 {
    public static void main(String[] args) {
        final CommonResource commonResource = new CommonResource();
//        for (int i = 0; i < 6; i++) {
//            final Thread thread = new Thread(new CountThread(commonResource));
//            thread.setName("Th" + i);
//            thread.start();
//        }
//        System.out.println();
        final CommonResource commonResource1 = new CommonResource();
        for (int i = 0; i < 6; i++) {
            final Thread thread = new Thread(new CountThread1(commonResource1));
            thread.setName("Th" + i);
            thread.start();
        }
    }
}

class CommonResource {
    int x = 0;

    synchronized void inc() {
        x = 1;
        for (int i = 1; i < 5; i++) {
            System.out.printf("%s %d \n", Thread.currentThread().getName(), x);
            x++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

class CountThread1 implements Runnable {

    CommonResource res;

    CountThread1(CommonResource res) {
        this.res = res;
    }

    public void run() {
        res.inc();
    }
}

class CountThread implements Runnable {

    CommonResource res;

    CountThread(CommonResource res) {
        this.res = res;
    }

    public void run() {
        synchronized (res) {
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}