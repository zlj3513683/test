package zlj.study.proxy.zijiema;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zoulinjun
 * @title: MyTest
 * @projectName java_jichu
 * @description: 解析class文件并生成Class对象并调用其方法
 * @date 2021/1/5 11:37
 */
public class MyTest {

    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException {
        //读取本地的class文件内的字节码，转换成字节码数组
        File file = new File(".");
//        InputStream  input = new FileInputStream("C:\\zlj\\idea\\code\\zlj_study\\java_jichu\\out\\production\\java_jichu\\zlj\\study\\proxy\\zijiema\\Programmer.class");
        InputStream  input = new FileInputStream("E:\\mytest\\Programmer.class");
        byte[] result = new byte[1024];

        int count = input.read(result);
        // 使用自定义的类加载器将 byte字节码数组转换为对应的class对象
        MyClassLoader loader = new MyClassLoader();
        Class clazz = loader.defineMyClass( result, 0, count);
        //测试加载是否成功，打印class 对象的名称
        System.out.println(clazz.getCanonicalName());

        //实例化一个Programmer对象
        Object o= clazz.newInstance();
        try {
          //调用Programmer的code方法
           clazz.getMethod("code", null).invoke(o, null);
         } catch (IllegalArgumentException | InvocationTargetException
      | NoSuchMethodException | SecurityException e) {
      e.printStackTrace();
      }
    }
}
