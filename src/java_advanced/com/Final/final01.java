/**
 * @author: 一只羊驼
 * @date: 2024/2/2
 */

package java_advanced.com.Final;

public class final01 {
    public static void main(String args[]) {
        E e = new E();
//        e.TAX_RATE=0.09;
        System.out.println(G.NUM);
        //如果只是想用一下类里面的某个常量，并不想加载类，可以将static和final结合使用

    }
}

//1. 不想要A类被任何其他类集成，就可以加上 final 关键字修饰A类
//2. 不希望父类的某个方法被子类覆盖/重写，可以用final修饰
//3. 不希望类的某个属性的值被修改，可以用final修饰
//4. 不希望某个局部变量被修改，可以用final修饰
final class A {
}

//class B extends A{ }

class C {
    //不希望父类的某个方法被子类覆盖/重写，加上final修饰
    final public void hi() {

    }
}

class D extends C {
//    public void hi(){
//        System.out.println("重写了C的hi()");
//    }
}

class E {
    final public double TAX_RATE = 0.08;
}

class F {
    public void cry() {
        //此时NUM也称局部常量
        final double Num = 0.01;
//        Num=0.09;
        System.out.println("num=" + Num);
    }
}

class G {
    public final static int NUM = 10;//静态常量

    static {
        System.out.println("静态代码块被调用");
    }
}