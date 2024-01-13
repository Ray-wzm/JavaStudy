/**
 * @author 一只羊驼
 * @date 2024/1/13
 */

package java_obejct;

public class scope01 {
    public static void main(String args[]) {
        cat cat1 = new cat();
        cat1.cry();
        T t = new T();
        t.print(cat1);
    }
}

class T {
    //跨类调用的第一种方式
    public void print() {
        cat cat2 = new cat();
        cat2.cry();
        //全局变量可以通过对象跨类调用
        //局部变量只能在自己的方法中去调用
        //System.out.println(age);
    }

    //跨类调用的第二种方式
    public void print(cat C) {
        C.cry();
    }

}


class cat {
    //全局变量：也就是属性，作用域为整个类体 cat类：cry eat 等方法使用属性
    int age = 10;//属性在定义的时候可以直接赋值

    //属性的生命周期较长，伴随对象的创建而创建，伴随对象的销毁而销毁
    //局部变量的声明周期较短，便随代码块的执行而创建，伴随代码块的结束而销毁（也就是一次方法调用过程）

    //全局变量（属性）可以不赋值直接使用，因为有默认值
    //局部变量必须赋值后使用，没有默认值
    public double weight; //默认值 0.0
    String name = "Queen";//属性和局部变量可以重名，访问的时候遵循就近原则

    //属性（全局变量）可以加修饰符
    //局部变量不能加修饰符

    public void cry() {
        //1. 局部变量一般是指在成员方法中定义的变量
        //2. n 和 name 就是局部变量
        //3. n 和 name 的作用域在 cry 方法中
        int n = 10;
        String name = "Jack";
        System.out.println(name);
    }

    public void eat() {
        System.out.println("age=" + age);
    }
}
