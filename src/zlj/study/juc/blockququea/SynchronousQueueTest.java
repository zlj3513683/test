package zlj.study.juc.blockququea;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * @author zoulinjun
 * @title: SynchronousQueueTest
 * @projectName java_jichu
 * @description: SynchronousQueue
 * 没有缓冲的无界队列  必须put一个才能take一个出去
 * 在线程池中的newCache的获取线程池的时候就是用的这个，因为非核心线程数是无限的
 * @date 2021/2/9 17:10
 */
public class SynchronousQueueTest {

    public static void main(String[] args) {
        BlockingQueue blockingQueue = new SynchronousQueue();
    }

}
