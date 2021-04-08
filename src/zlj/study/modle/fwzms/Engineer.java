package zlj.study.modle.fwzms;

import java.util.Random;

/**
 * @author zoulinjun
 * @title: Engineer
 * @projectName java_jichu
 * @description: 工程师
 * @date 2021/1/5 13:22
 */
//
public class Engineer extends Staff {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // 工程师一年的代码数量
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
