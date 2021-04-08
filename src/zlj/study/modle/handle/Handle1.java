package zlj.study.modle.handle;

/**
 * @author zoulinjun
 * @title: Handle1
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/10 10:40
 */
public class Handle1 extends Handle{

    public Handle1(Handle handle) {
        super(handle);
    }

    @Override
    protected void doSomeThing(String string) {

        if("1".equals(string)){
            System.out.println("deal by handle1");
        }
        if(handle != null){
            handle.doSomeThing(string);
        }

    }
}
