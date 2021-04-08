package zlj.study.modle.fwzms;

/**
 * @author zoulinjun
 * @title: ClientTest
 * @projectName java_jichu
 * @description: 访问者模式测试类
 * @date 2021/1/5 13:25
 */
public class ClientTest {

    public static void main(String[] args) {
        // 构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO看报表 ===========");
        report.showReport(new CEOVisitor());
        System.out.println("=========== CTO看报表 ===========");
        report.showReport(new CTOVisitor());
    }
}
