package zlj.study.modle.sigle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author zoulinjun
 * @title: EnumSingle
 * @projectName java_jichu
 * @description: 枚举
 * @date 2021/2/9 15:21
 */
public enum Singleton {

    INSTANCE,ss;
    private String objName;
    public String getObjName() {
        return objName;
    }
    public void setObjName(String objName) {
        this.objName = objName;
    }
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Singleton.class;
        Constructor<Singleton>[] constructor = clazz.getDeclaredConstructors();
        Constructor<Singleton> constructor1 = constructor[0];
        constructor1.setAccessible(true);
//        Singleton single = constructor1.newInstance();
//        System.out.println(single);
        // 单例测试
        Singleton firstSingleton = Singleton.INSTANCE;
        Singleton ss = Singleton.ss;
        System.out.println(firstSingleton);
        System.out.println(ss);
        firstSingleton.setObjName("firstName");
        System.out.println(firstSingleton.getObjName());
        Singleton secondSingleton = Singleton.INSTANCE;
        System.out.println(secondSingleton);
        secondSingleton.setObjName("secondName");
        System.out.println(firstSingleton.getObjName());
        System.out.println(secondSingleton.getObjName());
        // 反射获取实例测试
        try {
            Singleton[] enumConstants = Singleton.class.getEnumConstants();
            for (Singleton enumConstant : enumConstants) {
                System.out.println(enumConstant.getObjName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
