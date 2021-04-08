package zlj.study.juc.condition;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author zoulinjun
 * @title: CyclicBarrierTest
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/10 9:25
 */
public class CyclicBarrierTest {

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        cyclicBarrier.await();
    }

}
