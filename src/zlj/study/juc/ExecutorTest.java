package zlj.study.juc;

import java.util.concurrent.*;

/**
 * @author zoulinjun
 * @title: ExecutorTest
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/1/5 10:11
 */
public class ExecutorTest {

//    private final ExecutorService executor = Executors.newCachedThreadPool(
//            new NamedInternalThreadFactory("forking-cluster-timer", true));

    public static void main(String[] args) throws InterruptedException {
        System.out.println(print());
    }

    public static String print() throws InterruptedException {
        BlockingQueue<Object> ref = new LinkedBlockingQueue<>();


        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ExecutorService cachedThreadPool2 = Executors.newFixedThreadPool(10);
        ExecutorService cachedThreadPool3 = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            /*try {
                Thread.sleep(index * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(index);
                    ref.offer("result" + index);
                }
            });
        }
        Object ret = ref.poll(1000, TimeUnit.MILLISECONDS);
        return (String)ret;
    }

}
