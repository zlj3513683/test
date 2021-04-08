package zlj.study.modle.fwzms;

import java.util.Random;

/**
 * @author zoulinjun
 * @title: Staff
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/1/5 13:22
 */
// 员工基类
public abstract class Staff {

    public String name;
    public int kpi;// 员工KPI

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }
    // 核心方法，接受Visitor的访问
    public abstract void accept(Visitor visitor);
}