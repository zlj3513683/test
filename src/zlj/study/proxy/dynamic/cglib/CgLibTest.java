package zlj.study.proxy.dynamic.cglib;

import zlj.study.proxy.House;
import zlj.study.proxy.impl.HouseImpl;

/**
 * @author zoulinjun
 * @title: CgLibTest
 * @projectName java_jichu
 * @description: CGlib动态代理
 * @date 2021/1/4 11:38
 */
public class CgLibTest {

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        CglibIntercptor intercptor = new CglibIntercptor();
        Programmer programmerProxy = (Programmer)intercptor.getInstance(programmer);
        String res = programmerProxy.code();
        System.out.println(res);
    }

}
