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

        //将B类中的Sum方法注释掉，重新运行代码。运行类型是B，B中没有sum方法，找到B的父类A，A的Sum中有Get I函数，B也有，
        //由于对象的动态绑定机制，该方法会和该对象的内存地址，也就是运行类型绑定，也就是去调用B的方法；
        //但是属性是没有动态绑定机制的，哪里声明，就在哪里使用

    }
}