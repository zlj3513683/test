package zlj.study.juc;

import sun.misc.Unsafe;
import zlj.study.juc.cas.MyCas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zoulinjun
 * @title: Cas
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/9 11:01
 */
public class Cas extends MyCas {


    public static void main(String[] args) {
        Cas cas = new Cas();
        int stat =  cas.state;
        if(stat == 0){
            cas.cas(0,1);
        }
        System.out.println(cas.state);
    }

}
