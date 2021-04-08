package zlj.study.modle.sigle;

/**
 * @author zoulinjun
 * @title: LazySingle2
 * @projectName java_jichu
 * @description: 懒汉式-线程安全(性能不好)
 * 在一个时间点只能有一个线程能够进入该方法，从而避免了实例化多次 uniqueInstance。
 * @date 2021/2/9 14:42
 */
public class LazySingle2 {

    private static LazySingle2 uniqueSingle;

    private LazySingle2() {

    }

    public static synchronized LazySingle2 getSingle(){
        if(uniqueSingle == null){
            uniqueSingle = new LazySingle2();
        }
        return uniqueSingle;
    }
}
