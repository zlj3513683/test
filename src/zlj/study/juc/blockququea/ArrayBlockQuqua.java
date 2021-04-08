package zlj.study.juc.blockququea;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;

/**
 * @author zoulinjun
 * @title: ArrayBlockQuqua
 * @projectName java_jichu
 * @description: ArrayBlockingQueue
 * 数组阻塞有界队列  数据结构为数组
 * 没有实现读写分离
 * @date 2021/2/9 15:26
 */
public class ArrayBlockQuqua {

    public static void main(String[] args) throws InterruptedException {
//        BlockingQueue
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue(10);

        new Thread(()->{
            while (true){
                try {
                    double dd = Math.random();
                    System.out.println("生产了:" + dd);
                    blockingQueue.put("" + dd);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Thread.sleep(2000);

        new Thread(()->{
            while (true){
                try {
                    String data = blockingQueue.take();
                    System.out.println("消费了:" + data);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}
