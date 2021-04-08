package zlj.study.juc.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author zoulinjun
 * @title: Callable
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/27 11:11
 */
public class MyCallable {

    static class Ca implements Callable{
        @Override
        public Object call() throws Exception {
            Thread.sleep(2000);
            return "sucess";
        }
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Ca c= new Ca();
        FutureTask futureTask = new FutureTask(c);
        new Thread(()->{
            System.out.println("aaa");
        });

        new Thread(new FutureTask<String>(()->{
            return "fac";
        }));
        new Thread(futureTask).start();
        System.out.println("stret");
        System.out.println(futureTask.get());

//        Thread thread = new Callable<String>(()->{
//           return null;
//        });

    }


}
