/**
 * @author: 一只羊驼
 * @date: 2024/2/20
 */

package java_advanced.com.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod01 {
    public static void main(String args[]) {
        //Arrays里面包含了一系列静态方法，用于管理或操作数组（比如排序或搜索）
        //(1)toString
        Integer[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
        //(2)sort
        Integer[] integer = {-1,9,1,23,5};
        //sort方法，可以通过传入一个接口 Comparator 实现定制排序
        //传入两个参数，（1）排序的数组arr （2）实现了 Comparator 接口的匿名内部类，要求实现Compare方法

        Arrays.sort(integer, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer)o1;
                Integer i2 =(Integer)o2;
                return i2-i1;
            }
        });
        System.out.println(Arrays.toString(integer));
    }
}
