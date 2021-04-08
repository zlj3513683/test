package zlj.study.proxy.zijiema.javassist;


import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;
/**
 * @author zoulinjun
 * @title: MyGenerator
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/1/5 14:15
 */
public class MyGenerator {

    public static void main(String[] args) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        //创建Programmer类
        CtClass cc= pool.makeClass("zlj.study.proxy.zijiema.Programmer");
        //定义code方法
        CtMethod method = CtNewMethod.make("public void code(){}", cc);
        //插入方法代码
        method.insertBefore("System.out.println(\"I'm a Programmer,Just Coding.....\");");
        cc.addMethod(method);
        //保存生成的字节码
        cc.writeFile("d://temp");
    }
}
