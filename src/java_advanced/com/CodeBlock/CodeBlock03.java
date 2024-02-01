/**
 * @author: 一只羊驼
 * @date: 2024/2/1
 */

package java_advanced.com.CodeBlock;

public class CodeBlock03 {
    public static void main(String args[]) {
        BBB bbb = new BBB();
        /**
         * getA被调用
         * AAA静态代码块被调用
         * getB被调用
         * BBB静态代码块被调用
         * (object)
         * AAA普通代码块被调用
         * AAA()构造器被调用
         * BBB普通代码块被调用
         * BBB()构造器被调用
         */
    }
}

class AAA {
    private static int a = getA();

    static {
        System.out.println("AAA静态代码块被调用");
    }

    {
        System.out.println("AAA普通代码块被调用");
    }

    public AAA() {
        System.out.println("AAA()构造器被调用 ");
    }

    public static int getA() {
        System.out.println("getA被调用");
        return 10;
    }
}

class BBB extends AAA {
    private static int b = getB();

    static {
        System.out.println("BBB静态代码块被调用");
    }

    {
        System.out.println("BBB普通代码块被调用");
    }

    public BBB() {
        System.out.println("BBB()构造器被调用 ");
    }

    public static int getB() {
        System.out.println("getB被调用");
        return 20;
    }
}

/**
 * 创建一个子类对象时（继承），静态代码块、静态属性初始化、普通代码块、普通属性初始化、构造方法调用顺序：
 *
 * 1. 父类的静态代码块和静态属性
 * 2. 子类的静态代码块和静态属性
 * 3. 父类的普通代码块和普通属性初始化
 * 4. 子类的普通代码块和普通属性初始化
 * 5. 父类构造方法
 * 6. 子类构造方法
 */