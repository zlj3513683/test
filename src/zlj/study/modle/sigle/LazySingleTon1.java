package zlj.study.modle.sigle;

/**
 * @author zoulinjun
 * @title: LazySingleTon1
 * @projectName java_jichu
 * @description: 懒汉式-线程不安全
 * @date 2021/2/9 14:37
 */
public class LazySingleTon1 {

    private static LazySingleTon1 uniqueSingle;

    private LazySingleTon1() {
    }

    public static LazySingleTon1 getUniqueSingle(){
        if(uniqueSingle == null){
            uniqueSingle = new LazySingleTon1();
        }
        return uniqueSingle;
    }
}
