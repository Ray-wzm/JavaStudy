/**
 * @author 一只羊驼
 * @date 2024/1/13
 */

package java_Basics.java_obejct;

public class this01 {
    public static void main(String args[]) {
        Dog01 dog = new Dog01();
        System.out.println(dog.name);
    }
}
class Dog01{
    String name;
    int age;

    public  Dog01(){
        //this 访问构造器语法，就是直接 this(参数列表)
        //注意：只能在构造器中使用（即只能在狗在其中访问另外一个构造器）
        this("linke",100);
        //如果有 this()，则必须放到第一条语句，否则报错
    }

    public  Dog01(String name,int age){
        //java虚拟机会给每个对象分配一个this，代表当前对象
        this.name=name; //也就是将当前对象的属性（构造器在调用哪个对象，用的就是哪个对象的属性）
        this.age=age;
    }
}