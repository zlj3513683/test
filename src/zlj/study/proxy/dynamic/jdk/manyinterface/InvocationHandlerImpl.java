package zlj.study.proxy.dynamic.jdk.manyinterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zoulinjun
 * @title: InvocationHandlerImpl
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/1/5 14:53
 */
public class InvocationHandlerImpl implements InvocationHandler {

    private ElectricCar car;

    public InvocationHandlerImpl(ElectricCar car)
    {
        this.car=car;
    }

    @Override
    public Object invoke(Object paramObject, Method paramMethod,
                         Object[] paramArrayOfObject) throws Throwable {
        System.out.println("You are going to invoke "+paramMethod.getName()+" ...");
        paramMethod.invoke(car, null);
        System.out.println(paramMethod.getName()+" invocation Has Been finished...");
        return null;
    }

}
