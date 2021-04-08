package zlj.study.modle.fwzms;

/**
 * @author zoulinjun
 * @title: ReportUtil
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/1/5 13:25
 */
public class ReportUtil {
    public void visit(Staff staff) {
        if (staff instanceof Manager) {
            Manager manager = (Manager) staff;
            System.out.println("经理: " + manager.name + ", KPI: " + manager.kpi +
                    ", 新产品数量: " + manager.getProducts());
        } else if (staff instanceof Engineer) {
            Engineer engineer = (Engineer) staff;
            System.out.println("工程师: " + engineer.name + ", KPI: " + engineer.kpi);
        }
    }
}
