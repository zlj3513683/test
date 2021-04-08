package zlj.study.modle.fwzms;

/**
 * @author zoulinjun
 * @title: CTOVisitor
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/1/5 13:25
 */
public class CTOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.name + ", 代码行数: " + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理: " + manager.name + ", 产品数量: " + manager.getProducts());
    }
}
