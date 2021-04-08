package zlj.study.modle.handle;

/**
 * @author zoulinjun
 * @title: Test
 * @projectName java_jichu
 * @description: 责任链模式
 * @date 2021/2/10 10:42
 */
public class Test {

    public static void main(String[] args) {
        Handle handle1 = new Handle1(null);
        Handle handle2 = new Handle2(handle1);
        handle2.doSomeThing("1");
        handle2.doSomeThing("2");
    }

}
