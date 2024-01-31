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
        A a = new A();
        //通过对象名.类变量名
        System.out.println("name=" + a.name);
    }
}

class A {
    public static String name = "Ray";
}