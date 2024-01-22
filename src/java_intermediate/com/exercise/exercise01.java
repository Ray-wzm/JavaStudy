/**
 * @author: 一只羊驼
 * @date: 2024/1/22
 */

package java_intermediate.com.exercise;

public class exercise01 {
    public static void main(String args[]) {
        C c = new C();
        //1. new的是C类的无参构造，找到C的无参构造
        //2. 无参构造里的this,意思是调用本类的有参构造
        //3. 子类的无参构造会一直向上找到父类的无参构造，并向下顺序执行

        //我是A类
        //我是B的有参构造:B
        //我是C的有参构造:C
        //我是C的无参构造


    }
}

class A {
    public A() {
        System.out.println("我是A类");
    }
}

class B extends A {
    public B() {
        System.out.println("我是B的无参构造");
    }

    public B(String name) {
        System.out.println("我是B的有参构造:" + name);
    }
}

class C extends B {
    public C() {
        this("C");
        System.out.println("我是C的无参构造");
    }

    public C(String name) {
        super("B");
        System.out.println("我是C的有参构造:" + name);
    }
}