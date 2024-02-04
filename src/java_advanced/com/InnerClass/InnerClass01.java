/**
 * @author: 一只羊驼
 * @date: 2024/2/4
 */

package java_advanced.com.InnerClass;

public class InnerClass01 {
    public static void main(String args[]) {
    }
}

class outter {//外部类
    private int n1 = 100;//属性

    //构造器
    public outter(int n1) {
        this.n1 = n1;
    }

    public void show() {
        System.out.println("我是外部类的show方法");
    }

    {
        System.out.println("我是外部类的代码块");
    }

    //内部类：在outter类的内部加个类
    class Inner {

    }
}

/**
 * 内部类，一共有四种：
 * 1. 定义在外部类的局部位置的类，（比如在方法内）：
 * （1）一种称为：局部内部类（有类名）
 * （2）一种成为：匿名内部类（没有类名，重点！！！）
 * 2. 定义在外部类的成员位置上
 * （1）一种称为：成员内部类（没有用static修饰）
 * （2）一种称为：静态内部类（使用static修饰）
 */