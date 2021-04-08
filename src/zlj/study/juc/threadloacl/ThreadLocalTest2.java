package zlj.study.juc.threadloacl;

/**
 * @author zoulinjun
 * @title: ThreadLocalTest
 * @projectName java_jichu
 * @description: 虽然，ThreadLocal让访问某个变量的线程都拥有自己的局部变量，但是如果这个局部变量都指向同一个对象呢？这个时候ThreadLocal就失效了。
 * @date 2021/1/15 11:23
 */
public class ThreadLocalTest2 {
    private static final   Integer a = new Integer(0);
    private static final ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return a;
        }
    };


    public static void main(String[] args) {
//        ThreadLocal
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    threadLocal.set(threadLocal.get() + 5 );
                    System.out.println(Thread.currentThread().getName() +
                            " : " +threadLocal.get());
                }
            },"thread" + i);
        }

        for (int i = 0; i < 5; i++) {
            threads[i].start();
        }

    }


}
