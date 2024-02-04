/**
 * @author 一只羊驼
 * @date 2024/2/4
 */

package java_advanced.com.InnerClass;

public class StaticInnerClass {
    public static void main(String args[]) {
        new outter10.inner().say();
    }
}

class outter10{
    private int i=100;
    private static String name = "link";
    //1. 放在外部类的成员位置，且有static修饰
    static class inner{
        public void say(){
            //可以直接访问外部类的静态成员，包括私有的，但是不能访问非静态成员
            //可以添加访问修饰符，因为他的地位就是个成员
            //作用域和其他类一样，为整个类体
            //System.out.println(i);
            System.out.println(name);
        }
    }
    public void say(){
        new inner().say();
    }
}