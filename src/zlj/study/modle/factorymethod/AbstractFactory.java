package zlj.study.modle.factorymethod;

/**
 * @author zoulinjun
 * @title: AbstractFactory
 * @projectName java_jichu
 * @description: 工厂方法
 * @date 2021/2/10 10:07
 */
public abstract class AbstractFactory {

    public void dosomething(){
        Userinterface userinterface = createUser();
        userinterface.study();
    }

    abstract Userinterface createUser();

}
