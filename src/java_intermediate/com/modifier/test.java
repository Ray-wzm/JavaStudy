/**
 * @author: 一只羊驼
 * @date: 2024/1/19
 */

package java_intermediate.com.modifier;

public class test {
    public static void main(String args[]) {
        A a = new A();
        System.out.println(a.n1+a.n2+a.n3);
        //尝试输出a.n4报错n4是私有对象，不能被访问
        B b= new B();
        b.say();
    }
}
