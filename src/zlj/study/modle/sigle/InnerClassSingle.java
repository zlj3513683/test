package zlj.study.modle.sigle;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author zoulinjun
 * @title: InnerClassSingle
 * @projectName java_jichu
 * @description: 静态内部类
 * 缺点:
 *  可以通过反射破解单例
 *  可以通过序列化破解单例(需实现Serializable接口)
 *  详见main方法测试
 * @date 2021/2/9 14:51
 */
public class InnerClassSingle implements Serializable {
    private static InnerClassSingle uniqueSingle;

    private InnerClassSingle() {
        System.out.println("---create single---");
    }

    public static InnerClassSingle getUniqueSingle(){
        System.out.println("---get single---");
        return InnerSingle.single;
    }


    private static class InnerSingle{
        private static final InnerClassSingle single = new InnerClassSingle();
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取单例
        InnerClassSingle single = InnerClassSingle.getUniqueSingle();
        System.out.println(single);

        //反射创建实例
        Class clazz = InnerClassSingle.class;
        Constructor<InnerClassSingle> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        InnerClassSingle single1 = constructor.newInstance();
        System.out.println(single1);
        System.out.println(single == single1);

        //序列化方式创建实例
        //引入依赖
        /**
         * <dependency>
         *     <groupId>org.apache.commons</groupId>
         *     <artifactId>commons-lang3</artifactId>
         *     <version>3.8.1</version>
         * </dependency>
         */
//        Singleton instance = Singleton.getInstance();
//        byte[] serialize = SerializationUtils.serialize(instance);
//        Singleton newInstance = SerializationUtils.deserialize(serialize);
//        System.out.println(instance == newInstance);
    }
}
