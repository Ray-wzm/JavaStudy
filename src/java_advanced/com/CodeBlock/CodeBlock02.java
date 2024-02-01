/**
 * @author: 一只羊驼
 * @date: 2024/2/1
 */

package java_advanced.com.CodeBlock;

public class CodeBlock02 {
    public static void main(String args[]) {
        /**
         * 创建一个对象，在一个类中的调用顺序：
         * 1. 调用静态代码块和静态属性初始化
         *    static int i;
         *    static{}
         * 2. 调用普通代码块和普通属性的初始化
         *    int i;
         *    {}
         * 3. 调用构造方法
         *
         */

        A a = new A(2);
    }
}

class A {

    private int n2 = getN2();

    {
        System.out.println("普通代码块被调用");
    }

    private static int n1 = getN1();

    static {
        System.out.println("A 静态代码块 01 ");
    }


    public static int getN1() {
        System.out.println("getN1被调用");
        return 100;
    }

    public int getN2() {
        System.out.println("getN2被调用");
        return 50;
    }

    public A(int n2) {
        //构造器的最前面隐藏了一个super和调用普通代码块{}
        //也就是先去执行父类构造器，父类调用完再回来执行本类的普通代码块
        this.n2 = n2;
        System.out.println("构造器被调用");
    }
}