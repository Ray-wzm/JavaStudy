/**
 * @author: 一只羊驼
 * @date: 2024/1/25
 */

package java_intermediate.com.dynamic;

public class dynamic01 {
    public static void main(String args[]) {
        A a =new B(); //向上转型，编译类型是A，运行类型是B
        System.out.println(a.sum());//去调用B类的sum方法
        System.out.println(a.sum1());//B类没有sum1方法，找B的父类A
    }
}
