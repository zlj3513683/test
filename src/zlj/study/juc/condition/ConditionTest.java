package zlj.study.juc.condition;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zoulinjun
 * @title: ConditionTest
 * @projectName java_jichu
 * @description: 测试condition
 * @date 2021/2/9 16:30
 */
public class ConditionTest {

    private static final Lock lock = new ReentrantLock();
    private static final Condition conditionA = lock.newCondition();
    private static final Condition conditionB = lock.newCondition();


    public void awaitA(){
        lock.lock();
        try{
            try {
                System.out.println("A等待");
                conditionA.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "start");
        }finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        lock.lock();
        try{
            try {
                System.out.println("B等待");
                conditionB.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "start");
        }finally {
            lock.unlock();
        }
    }


    public void sinerA(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + "start");
            System.out.println("通知A");
            conditionA.signal();
        }finally {
            lock.unlock();
        }
    }

    public void sinerB(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + "start");
            System.out.println("通知B");
            conditionB.signal();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ConditionTest conditionTest = new ConditionTest();
        new Thread(()->{
            conditionTest.awaitA();
        },"A").start();
        new Thread(()->{
            conditionTest.awaitB();
        },"B").start();
        new Thread(()->{
            conditionTest.sinerA();
        },"C").start();
        new Thread(()->{
            conditionTest.sinerB();
        },"D").start();

    }

}
