package zlj.study.juc.blockququea.delay;

import java.util.concurrent.DelayQueue;

/**
 * @author zoulinjun
 * @title: ProcessData
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/9 17:23
 */
public class ProcessData {

    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayData> delayQueue = new DelayQueue<>();

        DelayData a = new DelayData(5, "A", 5000);
        DelayData b = new DelayData(8, "B", 8000);
        DelayData c = new DelayData(2, "C", 2000);

        delayQueue.add(a);
        delayQueue.add(b);
        delayQueue.add(c);

        long oldTime = System.currentTimeMillis();
        System.out.println("开始计时时间:" + System.currentTimeMillis());
        for (int i = 0; i < 3; i++) {
            DelayData data = delayQueue.take();
            long newTime = System.currentTimeMillis();
            System.out.print("id:"+data.getId()+"，数据:"+data.getName()+"被移除，当前时间:"+newTime);
            System.out.println(" 延迟了" + (newTime - oldTime)/1000);
        }
    }


}
