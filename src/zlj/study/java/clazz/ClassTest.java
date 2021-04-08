package zlj.study.java.clazz;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zoulinjun
 * @title: ClassTest
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/1/29 14:44
 */
public class ClassTest {

    public static void main(String[] args) {
        //判断是否为类的父类
        System.out.println(Parent.class.isAssignableFrom(Son.class));
    }

    public  void testSync(){
        synchronized (new Son()){
            new Son();
        }
    }

    public synchronized void testSync2(){
            new Son();
    }

}
