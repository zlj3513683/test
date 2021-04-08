package zlj.study.modle.fwzms;

import java.util.Random;

/**
 * @author zoulinjun
 * @title: Manager
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/1/5 13:23
 */
// 经理
public class Manager extends Staff {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // 一年做的产品数量
    public int getProducts() {
        return new Random().nextInt(10);
    }
}