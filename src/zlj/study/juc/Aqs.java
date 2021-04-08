package zlj.study.juc;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zoulinjun
 * @title: Aqs
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/9 9:12
 */
public class Aqs {

    public static void main(String[] args) throws InterruptedException {
//        BlockingQueue
        Lock lock = new ReentrantLock();

        new Thread(()->{
            lock.lock();
            try{
                for (int i = 0 ;i< 5;i++){
                    System.out.println("heelo lock  1111111");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }finally {
                lock.unlock();

            }

        },"t1").start();

        Thread.sleep(2000);

        Thread t2 = new Thread(()->{
            lock.lock();
            try{
                while (true){
                    System.out.println("heelo lock 22222" + Thread.currentThread().isInterrupted());
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("中断状态");
                        throw new RuntimeException("中断");
                    }
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println("中断了");
                        throw new RuntimeException("中断了");
                    }

                }

            }finally {
                lock.unlock();

            }
        },"t2");
        t2.start();

        Thread.sleep(1000);

        System.out.println("开启中断");
        t2.interrupt();


        Thread.sleep(1000);

        /*Thread t3 = new Thread(()->{
            try {
                lock.lockInterruptibly();
                while (true){
                    System.out.println("heelo lock 3333");
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("中断状态");
                        throw new RuntimeException("中断");
                    }
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        System.out.println("seleee");
//                        e.printStackTrace();
//                    }

                }
            } catch (InterruptedException e) {
                System.out.println("t3直接中断");
                e.printStackTrace();

            }finally {
                lock.unlock();

            }
        },"t3");
        t3.start();
        Thread.sleep(1000);

        t3.interrupt();

        Thread t4 = new Thread(()->{
            try {
                lock.lockInterruptibly();
                while (true){
                    System.out.println("heelo lock 44444");
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("中断状态4");
                        throw new RuntimeException("中断4");
                    }
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        System.out.println("seleee");
//                        e.printStackTrace();
//                    }

                }
            } catch (InterruptedException e) {
                System.out.println("t4直接中断");
                e.printStackTrace();

            }finally {
                lock.unlock();

            }
        },"t4");
        t4.start();
        Thread.sleep(1000);

        t4.interrupt();*/
    }

}
