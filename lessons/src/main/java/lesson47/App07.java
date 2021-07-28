package lesson47;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class App07 {
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {

        System.out.println("barrier");
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(11);

        for (int i = 0; i < cyclicBarrier.getParties()-1; i++) {
            new Thread(new MailSender(cyclicBarrier)).start();
        }

        cyclicBarrier.await();

        System.out.println("saved to db");

        cyclicBarrier.reset();

        System.out.println("latch");
        final CountDownLatch latch = new CountDownLatch(10);

        for (int i = 0; i < 10; i++) {
            new Thread(new MailSender1(latch)).start();
        }

        latch.await();
        System.out.println("all saved to db");
    }
}

class MailSender implements Runnable {

    private CyclicBarrier cyclicBarrier;

    public MailSender(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " sent email");
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName() + " save to db");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

class MailSender1 implements Runnable {

    private CountDownLatch latch;

    public MailSender1(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " sent email");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        latch.countDown();
        System.out.println(Thread.currentThread().getName() + " save to db");
    }
}
