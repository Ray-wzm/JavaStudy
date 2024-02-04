/**
 * @author: 一只羊驼
 * @date: 2024/2/4
 */

package java_advanced.com.InnerClass;

public class AnonymousInnerClassDetails {
    public static void main(String args[]) {
        outter05 outter05 = new outter05();
        outter05.f1();
    }
}

class outter05{
    private int n1=99;
    public void f1(){
        Person person = new Person(){
            @Override
            public void hi() {
                //可以直接访问外部类的所有成员，包括私有属性
                System.out.println("匿名内部类重写了hi方法"+n1);
            }
        };
        person.hi();//动态绑定，真实的运行类型是outer05$04

        //也可以直接调用hi()，匿名内部类本身返回的也是对象
        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法，直接调用");
            }
        }.hi();
    }
}

class Person{
    public void hi(){
        System.out.println("person hi()");
    }
}