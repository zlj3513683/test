package zlj.study.proxy.dynamic.jdk.manyinterface;

/**
 * @author zoulinjun
 * @title: ProxyTest
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/1/5 15:02
 */
public class ProxyTest {

    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();
        ProxyUtils.generateClassFile(car.getClass(), "ElectricCarProxy");
    }

}
