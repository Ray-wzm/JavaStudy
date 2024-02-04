/**
 * @author: 一只羊驼
 * @date: 2024/2/4
 */

package java_advanced.com.InnerClass;

/**
 * 匿名内部类
 * （1）本质是个类
 * （2）内部类
 * （3）该类没有名字
 * （4）同时还是一个对象
 */
public class AnonymousInnerClass {
    public static void main(String args[]) {
        Outter04 outter04 = new Outter04();
        outter04.method();
    }
}

class Outter04 { // 外部类
    private int n1 = 10; //属性

    public void method() { //方法
        //基于接口的匿名内部类
        //1. 想使用接口 IA，传统方式是要写一个类来实现该接口，并创建对象
        //2. Dog类只使用一次，以后不用了，单独创建个类很麻烦，此时就需要匿名内部类简化
//        IA dog = new Dog();
//        dog.cry();
        //dog的编译类型 IA
        //dog的运行类型 匿名内部类
        /**
         *  底层就会分配一个类名 $
         *  class Outter04$1 implements IA{
         *      @Override
         *             public void cry() {
         *                 System.out.println("小狗汪汪叫...");
         *             }
         *  }
         */
        //jdk底层，在创建匿名内部类后，立马创建了实例，并把地址返回给tiger
        //匿名内部类使用一次后就不能再使用
        IA dog = new IA(){
            @Override
            public void cry() {
                System.out.println("小狗汪汪叫...");
            }
        };
        System.out.println("Dog的运行类型 = "+ dog.getClass());
        dog.cry();
        //演示基于类的匿名内部类
        //1.编译类型是Father
        //2.运行类型 Outer04$2
        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("Father的运行类型 = "+ father.getClass());
    }
}

interface IA { //接口
    public void cry();
}
//class Dog implements IA{
//    @Override
//    public void cry() {
//        System.out.println("小狗汪汪叫...");
//    }
//}
class Father { //构造器
    public Father(String name) {

    }

    public void test() {

    }
}