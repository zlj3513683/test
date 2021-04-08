package zlj.study.java.array;

import zlj.study.modle.abstarctfactory.A;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zoulinjun
 * @title: ArrayTest
 * @projectName java_jichu
 * @description: 多维数组转换成一维数组
 * @date 2021/2/18 13:50
 */
public class ArrayTest {

    static Object[]  objects = null;
    static ArrayList<Object>  arrayList = new ArrayList();

    public static void many2One(ArrayList list){
        for (int i = 0; i < list.size();i++) {
            Object a = list.get(i);
            if(a instanceof ArrayList){
                many2One((ArrayList)a);
            }else{
                arrayList.add(a);
            }
        }
    }

    public static void many2One(Object[][] arr){
        for (int i = 0; i < arr.length;i++) {
            Object a = arr[i];
            if(a instanceof Arrays){
                many2One((ArrayList)a);
            }else{
                arrayList.add(a);
            }
        }
    }


    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        arrayList12.add("1");
        arrayList1.add("2");
        arrayList1.add(41211);
        arrayList.add(arrayList1);
        arrayList.add(arrayList12);
        System.out.println(arrayList);
        many2One(arrayList);
        System.out.println(ArrayTest.arrayList);
    }

}
