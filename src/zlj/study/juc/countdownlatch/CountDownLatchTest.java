package zlj.study.juc.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;

/**
 * @author zoulinjun
 * @title: CountDownLatchTest
 * @projectName java_jichu
 * @description: CountDownLatch测试
 * CountDownLatch(int count)：有参构造方法，初始化事件（线程）集个数，附带一个事件计数器
 *
 * countDown()：一个事件（线程）完成以后，调用这个方法，事件计数器减一
 *
 * await() ：阻塞当前线程，直到计数器为0，即所有事件完成
 * @date 2021/2/9 16:41
 */
public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(4);

        for (int i = 0; i < 10; i++) {
            Executors.newCachedThreadPool().execute(()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " start");
                countDownLatch.countDown();
            });
        }

        countDownLatch.await();

        System.out.println("主线程最后执行");
        testCondowloch();
    }


    private static  void testCondowloch() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);

        new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " start");
            countDownLatch.countDown();
        },"t1").start();
        new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " start");
            countDownLatch.countDown();
        },"t2").start();
        new Thread(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " start");
            countDownLatch.countDown();
        },"t3").start();
        new Thread(()->{
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " start");
            countDownLatch.countDown();
        },"t4").start();
        countDownLatch.await();

        System.out.println("主线程最后执行");
    }

}
