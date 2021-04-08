package zlj.study.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zoulinjun
 * @title: CglibIntercptor
 * @projectName java_jichu
 * @description: 实现方法拦截器接口
 * @date 2021/1/4 11:11
 */
public class CglibIntercptor implements MethodInterceptor {

    private Object taget;

    public Object getInstance(final Object taget){
        this.taget = taget;
        //cglib加强用来创建动态代理
        Enhancer enhancer = new Enhancer();
        //设置要动态代理的类
        enhancer.setSuperclass(this.taget.getClass());
        //设置回调，这里相当于是对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实行intercept()方法进行拦截
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("**** I am a hacker,Let's see what the poor programmer is doing Now...");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("****  Oh,what a poor programmer.....");
        return result;
    }
}
