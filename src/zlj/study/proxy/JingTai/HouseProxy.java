package zlj.study.proxy.JingTai;


import zlj.study.proxy.House;

/**
 * @author zoulinjun
 * @title: HouseProxy
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/1/4 10:09
 */
public class HouseProxy implements House {

    House house;

    public HouseProxy(final House house) {
        this.house = house;
    }

    @Override
    public void buyHouse() {
        System.out.println("买房前准备");
        house.buyHouse();
        System.out.println("买房后处理");
    }

    @Override
    public String dynameicBuyHouse() {
        return null;
    }
}
