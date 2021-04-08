package zlj.study.modle.sigle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author zoulinjun
 * @title: SingleTonTest
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/18 9:40
 */
public class SingleTonTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        HangreySingle.getUniqueSingle();
        System.out.println("1111111111111111");
        System.out.println(InnerClassSingle.getUniqueSingle());;

        Class clazz = InnerClassSingle.class;
        Constructor<InnerClassSingle> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        InnerClassSingle single = constructor.newInstance();
        System.out.println(single);

    }

}
