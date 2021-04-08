package zlj.study.juc.sync;

/**
 * @author zoulinjun
 * @title: SyncInteepdTest
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/9 13:41
 */
public class SyncInteepdTest {

    static  class Lock{

    }

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new Lock();
        new Thread(()->{
            synchronized (lock){
                for(int i=0;i<4;i++){
                    System.out.println(Thread.currentThread().getName() +  " start" + Thread.currentThread().isInterrupted());

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"t1").start();


        Thread.sleep(1000);

        Thread t2 = new Thread(()->{
            synchronized (lock){
                System.out.println(Thread.currentThread().getName() + " start" + Thread.currentThread().isInterrupted());
            }
        },"t2");

        t2.start();
        Thread.sleep(1000);

        t2.interrupt();
    }


}
