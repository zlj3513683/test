package zlj.study.modle.sigle;

/**
 * @author zoulinjun
 * @title: HangreySingle
 * @projectName java_jichu
 * @description: 饿汉式-线程安全
 * @date 2021/2/9 14:40
 */
public class HangreySingle {

    private static HangreySingle hangreySingle = new HangreySingle();

    private HangreySingle() {
        System.out.println("---create single---");
    }

    public static HangreySingle getUniqueSingle(){
        System.out.println("---get single---");
        return hangreySingle;
    }
}
