/**
 * @author 一只羊驼
 * @date 2024/1/13
 */

package java_Basics.java_obejct;

public class constructor01 {
    public static void main(String args[]) {
        //假设想要在创建一个对象后，就直接指定好里面属性的值，此时就要用到构造器
        //构造器：主要作用就是对新对象的初始化
        Person01 p = new Person01("林克", 100);
        System.out.println(p.name);
        Person01 p2 = new Person01("塞尔达");
        System.out.println(p2.name);
        Person01 p3 = new Person01();
        System.out.println(p3.age);
        Dog dog =new Dog();
    }
}

//构造器语法

/***
 *  [修饰符] 方法名（形参列表）{
 *      方法体;
 *  }
 *  1. 构造器的修饰符可以是默认的，也可以指定public等
 *  2. 构造器没有返回值！
 *  3. 方法名和类名必须一样
 *  4. 参数列表和成员方法一样的规则
 *  5. 构造器的调用，由系统自动完成
 **/
class Person01 {
    String name;
    int age;

    //构造器
    //1. 构造器没有返回值，也不能写void
    public Person01(String Pname, int Page) {
        //完成对象属性的初始化
        System.out.println("构造器被调用");
        name = Pname;
        age = Page;
    }
    //2. 一个类可以定义多个构造器，即构造器的重载
    public Person01(String Pname2){
        System.out.println("构造器2被调用");
        name=Pname2;
    }
    //3. 无参构造器
    public Person01(){
        age=18;
    }
}

class Dog{
    //如果程序员没有定义构造器，系统会自动给类生成一个默认的无参构造器（就是默认构造器）
    /**
     * 默认构造器
     * Dog(){
     *
     * }
     * 这也就是为什么创建一个新的对象的时候，要加上小括号
     * 可以使用javap 反编译看到
     */
    //如果定义了自己的构造器，那么默认的无参构造器就没有了，除非显式的定义Dog(){}
}