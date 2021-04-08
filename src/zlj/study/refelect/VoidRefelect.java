package zlj.study.refelect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zoulinjun
 * @title: VoidRefelect
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/25 11:52
 */
public class VoidRefelect {

    public void test(){

        System.out.println("void");
    }

    public Map testMap(){
        Map map = new HashMap();
        map.put("abc","a1111");
        return map;
    }


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = Class.forName(VoidRefelect.class.getName());
        Method method = clazz.getMethod("test");
        Method method2 = clazz.getMethod("testMap");
        Object obj = clazz.newInstance();
        Object oo = method.invoke(obj);
        Object oo2 = method2.invoke(obj);
        System.out.println();
    }
}
