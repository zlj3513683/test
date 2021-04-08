package zlj.study.modle.factory;

/**
 * @author zoulinjun
 * @title: AnimalFactory
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/1/19 17:05
 */
public class AnimalFactory {

    public static Animal getAnimal(String type){
        if("dog".equals(type)){
            return new Dog();
        }else if("cat".equals(type)){
            return new Cat();
        }
        return null;
    }

}
