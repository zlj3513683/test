package zlj.study.modle.abstarctfactory;

/**
 * @author zoulinjun
 * @title: F1
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/10 10:19
 */
public class F1 extends AbstractFactory{

    @Override
    A createA() {
        return new A1();
    }
}
