package zlj.study.modle.handle;

/**
 * @author zoulinjun
 * @title: Handle
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/10 10:38
 */
public abstract class Handle {

    public Handle handle;

    public Handle(Handle handle) {
        this.handle = handle;
    }

    protected abstract void doSomeThing(String string);
}
