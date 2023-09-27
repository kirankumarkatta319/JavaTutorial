package hakerRank;

import java.util.concurrent.atomic.AtomicInteger;

class ThreadDemo {

    AtomicInteger count = new AtomicInteger();

    public void increment()
    {
        count.incrementAndGet();
    }

}

class test1
{
    public static void main(String[] args) throws Exception{

        ThreadDemo td = new ThreadDemo();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++) {
                    td.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++) {
                    td.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(td.count);
    }
}
