package zlj.study.proxy.dynamic.jdk;

import zlj.study.proxy.House;
import zlj.study.proxy.MyInterface;
import zlj.study.proxy.impl.HouseImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zoulinjun
 * @title: DynamicTest
 * @projectName java_jichu
 * @description: 动态代理
 * @date 2021/1/4 10:46
 */
public class DynamicTest {

    public static void main(String[] args) {
        House house = new HouseImpl();
//        注意Proxy.newProxyInstance()方法接受三个参数：
//
//        ClassLoader loader:指定当前目标对象使用的类加载器,获取加载器的方法是固定的
//        Class<?>[] interfaces:指定目标对象实现的接口的类型,使用泛型方式确认类型
//        InvocationHandler:指定动态处理器，执行目标对象的方法时,会触发事件处理器的方法
        House huseProxy = (House) Proxy.newProxyInstance(House.class.getClassLoader(),
                new Class[]{House.class},
                new DynamicProxyHandle(house));
        String result = huseProxy.dynameicBuyHouse();
        System.out.println(result);

        System.out.println("---------------------");

        //没有实现类的接口创建代理对象
        MyInterface myInterface = (MyInterface) Proxy.newProxyInstance(MyInterface.class.getClassLoader(), new Class[]{MyInterface.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(args[0].toString());
                System.out.println(args[1].toString());
                System.out.println(method.getParameterTypes()[0].getName());
                System.out.println(method.getParameterTypes()[1].getName());
                System.out.println(method.getName());
                System.out.println(method.getClass().getName());
                return "Success";
            }
        });
        myInterface.testParm("i am a parm","i am b pam");
//        System.out.println(myInterface.testParm("i am a parm","i am b pam"));

    }

}
