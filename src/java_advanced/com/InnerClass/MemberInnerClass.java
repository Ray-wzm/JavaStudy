/**
 * @author: 一只羊驼
 * @date: 2024/2/4
 */

package java_advanced.com.InnerClass;

public class MemberInnerClass {
    public static void main(String args[]) {
        outter08 outter08 = new outter08();
        outter08.T();
    }
}

class outter08 {
    private int n1 = 10;
    public String name = "link";

    class Inner {//成员内部类
        private double sal= 99.8;
        public void say() {
            System.out.println("outter 的n1 " + n1 + "outter的name" + name);
        }
    }
    //方法
    public void T(){
        Inner inner = new Inner();
        inner.say();
        System.out.println(inner.sal);
    }
}
