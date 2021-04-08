package zlj.study.proxy.impl;

import zlj.study.proxy.House;

/**
 * @author zoulinjun
 * @title: HouseImpl
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/1/4 10:09
 */
public class HouseImpl implements House {

    @Override
    public void buyHouse() {
        System.out.println("买房子!");
    }

    @Override
    public String dynameicBuyHouse() {
        System.out.println("动态买房子");
        return "SUCCESS";
    }

}
