package lesson47;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class App05 {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Thread> reads = new ArrayList<>();
        ArrayList<Thread> increments = new ArrayList<>();
        ArrayList<Thread> decrements = new ArrayList<>();
        Resources resources = new ResourcesReentrantReadWrite();
//        Resources resources = new ResourcesLock();
//        Resources resources = new ResourcesSynchronized();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            Thread increment = new Increment(resources);
            Thread decrement = new Decrement(resources);
            increments.add(increment);
            decrements.add(decrement);
            increment.start();
            decrement.start();
        }

        for (int i = 0; i < 1000; i++) {
            Thread read = new Read(resources);
            reads.add(read);
            read.start();
        }

        for (int i = 0; i < 100; i++) {
            increments.get(i).join();
            decrements.get(i).join();
        }

        for (int i = 0; i < 1000; i++) {
            reads.get(i).join();
        }
        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    private static abstract class UserThread extends Thread {
        protected Resources resources;

        public UserThread(Resources resources) {
            this.resources = resources;
        }

    }

    private static class Read extends UserThread {

        public Read(Resources resources) {
            super(resources);
        }

        public void run() {
            resources.getCounter();
        }
    }

    private static class Increment extends UserThread {

        public Increment(Resources resources) {
            super(resources);
        }

        public void run() {
            resources.increment();
        }
    }

    private static class Decrement extends UserThread {

        public Decrement(Resources resources) {
            super(resources);
        }

        public void run() {
            resources.decrement();
        }
    }

    private static class ResourcesReentrantReadWrite implements Resources {

        private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

        private ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        private ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        private ReentrantLock lock = new ReentrantLock();

        public int getCounter() {
            readLock.lock();
            try {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return counter;
            } finally {
                readLock.unlock();
            }

        }

        private int counter = 0;

        public void increment() {
            writeLock.lock();
            try {
                counter++;
            } finally {
                writeLock.unlock();
            }
        }

        public void decrement() {
            writeLock.lock();
            try {
                counter--;
            } finally {
                writeLock.unlock();
            }
        }
    }

    private static class ResourcesLock implements Resources {

        private ReentrantLock lock = new ReentrantLock();

        public int getCounter() {
            lock.lock();
            try {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return counter;
            } finally {
                lock.unlock();
            }

        }

        private int counter = 0;

        public void increment() {
            lock.lock();
            try {
                counter++;
            } finally {
                lock.unlock();
            }
        }

        public void decrement() {
            lock.lock();
            try {
                counter--;
            } finally {
                lock.unlock();
            }
        }
    }

    private static class ResourcesSynchronized implements Resources {

        private ReentrantLock lock = new ReentrantLock();

        public synchronized int getCounter() {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return counter;
        }

        private int counter = 0;

        public synchronized void increment() {
            counter++;
        }

        public synchronized void decrement() {
            counter--;
        }
    }

    interface Resources {

        int getCounter();

        void increment();

        void decrement();
    }

}