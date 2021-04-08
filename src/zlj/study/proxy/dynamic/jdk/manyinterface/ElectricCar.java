package zlj.study.proxy.dynamic.jdk.manyinterface;

/**
 * 电能车类，实现Rechargable，Vehicle接口
 * @author louluan
 */
public class ElectricCar implements Rechargable, Vehicle {

    @Override
    public void drive() {
        System.out.println("Electric Car is Moving silently...");
    }

    @Override
    public void recharge() {
        System.out.println("Electric Car is Recharging...");
    }

    @Override
    public void yunshu(String wupinname,int wupinNum) {
        System.out.println("Electric Car is yunshu...," + wupinname + ":" + wupinNum);
    }

}