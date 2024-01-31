/**
 * @author 一只羊驼
 * @date 2024/1/31
 */

package java_advanced.com.Static;

public class StaticDetail {
    public static void main(String args[]) {
        System.out.println(B.n2);
        System.out.println(new B().n1);
       // System.out.println(B.n1);
    }
}

//1. 当我们需要让某个类的所有对象都共享一个变量的时候，就可以考虑使用类变量
//2. 类变量与实例变量（普通属性）的区别：类变量是所有对象独享的，实例变量是每个对象独享的
//3. 只有加上static才称之为类变量或静态变量，否则就是实例变量/普通变量/非静态变量
//4. 类变量可以通过 类名.类变量名 或者 对象名.类变量名 来访问，在满足访问修饰符的大原则下，推荐使用类名.类变量名
//5. 实例变量不能用类名.变量名访问，必须实例化对象 System.out.println(B.n1);
//6. 静态变量是类加载的时候，就创建了的，所以即使没有创建对象实例，也可以通过类名.类变量名来访问
//7. 类变量的生命周期是随着类的加载开始，随着类的消亡销毁。对象在不在跟类变量没关系


class B{
    public int n1=100;
    public static int n2=30;
}