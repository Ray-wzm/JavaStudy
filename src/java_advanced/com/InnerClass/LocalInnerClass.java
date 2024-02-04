/**
 * @author: 一只羊驼
 * @date: 2024/2/4
 */

package java_advanced.com.InnerClass;

/**
 * 1. 局部内部类：
 * 定义在外部类局部位置的类（比如成员方法中），有类名
 * 演示
 */
public class LocalInnerClass {
    public static void main(String args[]) {
        Outter outter = new Outter();
        System.out.println("Outter.this hascode="+outter);
        outter.m1();
    }
}

//其他类
class Other {
    private int o1;
    //o1.f1();
    //外部其他类不能访问局部内部类，因为局部内部类是一个局部变量，作用域只在当前方法体或代码块中
    //当外部类和局部内部类的成员重名的时候，默认遵循就近原则
    // 如果想访问外部类的成员，可以使用外部类名.this.成员(外部类名.this相当于外部类的对象)
}

//外部类
class Outter {
    private int n1 = 100;
    private int n2 = 200;

    private void m2() {
        System.out.println("Outter m2");
    }

    public void m1() {
        //方法
        //1. 定义在外部类局部位置的类（通常在成员方法中）,本质还是类
        //3. 不能添加访问修饰符，但是可以用final修饰(不能被继承)
        //4. 作用域：仅仅在定义他的方法或者代码块中
        //5. 局部内部类可以直接访问外部类的成员
        //6. 外部类在方法中创建局部内部类的对象，然后去访问内部类的成员
        class Inner {
            private int n2 = 300;

            //2. 可以访问外部类的所有成员，包含私有
            public void f1() {
                System.out.println("n1=" + n1);
                m2();
                System.out.println("就近原则，n2=" + n2);
                System.out.println("外部类的 n2=" + Outter.this.n2);
                System.out.println("Outter.this hascode="+Outter.this);
            }
        }
        Inner inner = new Inner();
        inner.f1();
    }
}