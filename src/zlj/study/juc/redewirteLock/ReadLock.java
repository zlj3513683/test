package zlj.study.juc.redewirteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author zoulinjun
 * @title: ReadLock
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/10 10:44
 */
public class ReadLock {

    public static void main(String[] args) throws InterruptedException {
        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = readWriteLock.readLock();
        ReentrantReadWriteLock.WriteLock writeLock = readWriteLock.writeLock();


        new Thread(()->{
            readLock.lock();
            try{
                while (true){
                    System.out.println(Thread.currentThread().getName()  + " start");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }finally {
                readLock.unlock();
            }
        },"t1").start();

        Thread.sleep(1000);

        new Thread(()->{
            readLock.lock();
            try{
                while (true){
                    System.out.println(Thread.currentThread().getName()  + " start");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }finally {
                readLock.unlock();
            }
        },"t2").start();

        Thread.sleep(1000);

        new Thread(()->{
            writeLock.lock();
            try{
                while (true){
                    System.out.println(Thread.currentThread().getName()  + " start");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }finally {
                writeLock.unlock();
            }
        },"t3").start();

        Thread.sleep(1000);

        new Thread(()->{
            readLock.lock();
            try{
                while (true){
                    System.out.println(Thread.currentThread().getName()  + " start");
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }finally {
                readLock.unlock();
            }
        },"t4").start();


    }

}
