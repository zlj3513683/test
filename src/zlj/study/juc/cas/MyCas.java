package zlj.study.juc.cas;

import sun.misc.Unsafe;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author zoulinjun
 * @title: MyCal
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/9 11:21
 */
public class MyCas {
    public volatile int state;
    public static final Unsafe unsafe = Unsafe.getUnsafe();
    public static final long statesoffeset;

    static {
        try {
            statesoffeset = unsafe.objectFieldOffset
                    (MyCas.class.getDeclaredField("state"));

        } catch (Exception ex) { throw new Error(ex); }
    }


    public void cas(int o,int n){
        unsafe.compareAndSwapInt(this,statesoffeset,o,n);
    }

}
