package zlj.study.juc.threadloacl;

/**
 * @author zoulinjun
 * @title: ThreadLocalTest
 * @projectName java_jichu
 * @description: 虽然，ThreadLocal让访问某个变量的线程都拥有自己的局部变量，但是如果这个局部变量都指向同一个对象呢？这个时候ThreadLocal就失效了。
 * @date 2021/1/15 11:23
 */
public class ThreadLocalTest {
    private static final  A a = new A();
    private static final ThreadLocal<A> threadLocal = new ThreadLocal<A>(){
        @Override
        protected A initialValue() {
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
                    threadLocal.get().setNumber(threadLocal.get().getNumber() + 5);
                    System.out.println(Thread.currentThread().getName() +
                            " : " +threadLocal.get().getNumber());
                }
            },"thread" + i);
        }

        for (int i = 0; i < 5; i++) {
            threads[i].start();
        }

    }

    static class A{
        private int number = 0;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }

}
