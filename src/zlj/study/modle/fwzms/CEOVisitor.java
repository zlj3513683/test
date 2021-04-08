package zlj.study.modle.fwzms;

/**
 * @author zoulinjun
 * @title: CEOVisitor
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/1/5 13:24
 */
// CEO访问者
public class CEOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.name + ", KPI: " + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理: " + manager.name + ", KPI: " + manager.kpi +
                ", 新产品数量: " + manager.getProducts());
    }
}