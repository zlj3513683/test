package zlj.study.modle.sigle;

/**
 * @author zoulinjun
 * @title: TwoCheckSingle
 * @projectName java_jichu
 * @description: 双重校验锁
 * @date 2021/2/9 14:48
 */
public class TwoCheckSingle {

    private volatile static TwoCheckSingle uniqueSingle;

    private TwoCheckSingle() {
    }

    public static TwoCheckSingle getUniqueSingle(){
        if(uniqueSingle == null){
            synchronized (TwoCheckSingle.class){
                if(uniqueSingle == null){
                    uniqueSingle = new TwoCheckSingle();
                }
            }
        }
        return uniqueSingle;
    }
}
