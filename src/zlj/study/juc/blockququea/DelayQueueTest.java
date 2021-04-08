package zlj.study.juc.blockququea;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

/**
 * @author zoulinjun
 * @title: DelayQueueTest
 * @projectName java_jichu
 * @description: DelayQueue
 * 一个带有延迟时间的无界阻塞队列。队列中的元素，只有等延时时间到了，
 * 才能取出来。此队列一般用于过期数据的删除，或任务调度。以下，模拟一下定长时间的数据删除。
 * @date 2021/2/9 17:19
 */
public class DelayQueueTest {

    public static void main(String[] args) {
        BlockingQueue blockingQueue = new DelayQueue();
    }

}
