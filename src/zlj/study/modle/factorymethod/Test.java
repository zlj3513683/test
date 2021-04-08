package zlj.study.modle.factorymethod;

/**
 * @author zoulinjun
 * @title: Test
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/10 10:12
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new UserFactory1();
        abstractFactory.dosomething();
        AbstractFactory abstractFactory1 = new UserFactory2();
        abstractFactory1.dosomething();
    }
}
