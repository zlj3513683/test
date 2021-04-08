package zlj.study.modle.factory;

/**
 * @author zoulinjun
 * @title: FactoryTest
 * @projectName java_jichu
 * @description: 简单工厂模式
 * @date 2021/1/19 17:06
 */
public class FactoryTest {

    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal("dog");
        dog.jiao();
        Animal cat = AnimalFactory.getAnimal("cat");
        cat.jiao();
    }

}
