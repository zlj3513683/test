package zlj.study.modle.factorymethod;

/**
 * @author zoulinjun
 * @title: UserFactory1
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/10 10:10
 */
public class UserFactory2 extends AbstractFactory{

    @Override
    Userinterface createUser() {
        return new User2();
    }
}
