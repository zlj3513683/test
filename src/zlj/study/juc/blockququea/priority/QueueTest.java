package zlj.study.juc.blockququea.priority;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author zoulinjun
 * @title: QueueTest
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/9 17:27
 */
public class QueueTest {

    public static void main(String[] args) throws InterruptedException {

        PriorityBlockingQueue<Person> priorityBlockingQueue = new PriorityBlockingQueue<>(1, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getId() - o2.getId();
            }
        });

        Person p2 = new Person(7, "李四");
        Person p1 = new Person(9, "张三");
        Person p3 = new Person(6, "王五");
        Person p4 = new Person(2, "赵六");
        priorityBlockingQueue.add(p1);
        priorityBlockingQueue.add(p2);
        priorityBlockingQueue.add(p3);
        priorityBlockingQueue.add(p4);

        //由于二叉树最小堆实现，用这种方式直接打印元素，不能保证有序
        System.out.println(priorityBlockingQueue);
        System.out.println(priorityBlockingQueue.take());
        System.out.println(priorityBlockingQueue);
        System.out.println(priorityBlockingQueue.take());
        System.out.println(priorityBlockingQueue);

    }

}
