package zlj.study.java.enums;

/**
 * @author zoulinjun
 * @title: MyEnum
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/18 10:52
 */
public enum MyEnum {

    INSTANCE1,
    INSTANCE2;

    private String objName;

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public static void main(String[] args) {
        MyEnum e1 = MyEnum.INSTANCE1;
        MyEnum e2 = MyEnum.INSTANCE2;
        System.out.println(e1 + " ----- " + e2);
        e1.setObjName("大狗子");
        e2.setObjName("二狗子");
        e1.setObjName("三狗子");
        MyEnum e3 = MyEnum.INSTANCE1;
        System.out.println(e1.getObjName());
        System.out.println(e2.getObjName());
        System.out.println(e3.getObjName());
    }
}
