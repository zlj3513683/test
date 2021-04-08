package zlj.study.proxy.JingTai;

import zlj.study.proxy.House;
import zlj.study.proxy.impl.HouseImpl;

/**
 * @author zoulinjun
 * @title: JingTaiTest
 * @projectName java_jichu
 * @description: 静态代理Demo
 *                  优点：可以做到在符合开闭原则的情况下对目标对象进行功能扩展。
 *                  缺点：我们得为每一个服务都得创建代理类，工作量太大，不易管理。同时接口一旦发生改变，代理类也得相应修改
 * @date 2021/1/4 10:11
 */
public class JingTaiTest {

    public static void main(String[] args) {
        House house = new HouseImpl();
        HouseProxy houseProxy = new HouseProxy(house);
        houseProxy.buyHouse();
    }
}
