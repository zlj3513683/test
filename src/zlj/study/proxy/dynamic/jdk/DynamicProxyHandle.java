package zlj.study.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zoulinjun
 * @title: DynamicProxyHandle
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/1/4 10:43
 */
public class DynamicProxyHandle implements InvocationHandler {

    private Object object;

    public DynamicProxyHandle(final Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("准备工作");
        Object result = method.invoke(object,args);
        System.out.println("完成处理");

        return result;
    }
}
