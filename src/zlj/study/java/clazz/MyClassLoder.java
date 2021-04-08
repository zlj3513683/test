package zlj.study.java.clazz;

import java.io.FileInputStream;

/**
 * @author zoulinjun
 * @title: MyClassLoder
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/3 15:13
 */
public class MyClassLoder extends ClassLoader{

    private String classPath;

    public MyClassLoder( String classPath) {
        this.classPath = classPath;
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        synchronized (getClassLoadingLock(name)) {
            Class<?> c = null;
            if("com.allinfinance.bo.agentpay.T90101BO".equals(name)){
                c = findClass(name);
            }else{
                c = super.loadClass(name);
            }
            return c;
        }
    }


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = new byte[0];
        try {
            data = loadByte(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defineClass(name,data,0,data.length);
    }

    private byte[] loadByte(String name) throws Exception {
        name = name.replaceAll("\\.", "/");
        FileInputStream fis = new FileInputStream(classPath + "/" + name
                + ".class");
        int len = fis.available();
        byte[] data = new byte[len];
        fis.read(data);
        fis.close();
        return data;
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoder myClassLoder = new MyClassLoder("C:\\zlj\\idea\\code\\shoudan\\S05\\mng\\target\\classes");
        Class clazz = myClassLoder.loadClass("com.allinfinance.bo.agentpay.T90101BO");
        System.out.println(clazz.getClassLoader());
    }
}
