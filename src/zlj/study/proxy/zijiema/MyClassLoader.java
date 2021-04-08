package zlj.study.proxy.zijiema;

/**
 * @author zoulinjun
 * @title: MyClassLoader
 * @projectName java_jichu
 * @description: 自定义一个类加载器，用于将字节码转换为class对象
 * @date 2021/1/5 11:37
 */
public class MyClassLoader extends ClassLoader {

    public Class<?> defineMyClass( byte[] b, int off, int len)
    {
        return super.defineClass(b, off, len);
    }

}
