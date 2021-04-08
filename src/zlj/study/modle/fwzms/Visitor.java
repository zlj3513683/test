package zlj.study.modle.fwzms;

/**
 * @author zoulinjun
 * @title: Visitor
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/1/5 13:24
 */
public interface Visitor {

    // 访问工程师类型
    void visit(Engineer engineer);

    // 访问经理类型
    void visit(Manager manager);
}
