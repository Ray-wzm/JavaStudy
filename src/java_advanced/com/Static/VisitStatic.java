/**
 * @author: 一只羊驼
 * @date: 2024/1/31
 */

package java_advanced.com.Static;

public class VisitStatic {
    public static void main(String args[]) {
        //类名.类变量
        //类变量是随着类的加载而创建的，即使没有创建对象实例，也可以访问
        System.out.println(A.name);
        A b=new A();
        System.out.println(A.name);
        A a = new A();
        //通过对象名.类变量名
        System.out.println("name=" + a.name);
    }
}

class A {
    public static String name = "Ray";

    //代码块，是类的一部分，属于类的成员；类似于方法，但没有方法名、返回或者参数，只有方法体
    //不通过对象或类显示调用，而是在加载类、创建对象的时候显示调用
    static {
        System.out.println("代码块");
    }
}


