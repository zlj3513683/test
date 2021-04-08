package zlj.study.refelect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zoulinjun
 * @title: FanXing
 * @projectName java_jichu
 * @description: 反射跳过泛型检查
 * @date 2021/1/4 9:13
 */
public class FanXing {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<String> stringList = new ArrayList<>();
        stringList.add("王二狗");
//        stringList.add(100);
        Class clazz = stringList.getClass();
        Method method = clazz.getMethod("add",Object.class);
        method.invoke(stringList,100);
        System.out.println(stringList.toString());
    }

}
