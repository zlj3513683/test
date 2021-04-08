package zlj.study.modle.abstarctfactory;

/**
 * @author zoulinjun
 * @title: Test
 * @projectName java_jichu
 * @description: 抽象工厂
 * @date 2021/2/10 10:20
 */
public class Test {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new F1();
        A a = abstractFactory.createA();
        AbstractFactory abstractFactory1 = new F2();
        A a1 = abstractFactory1.createA();
    }

}
