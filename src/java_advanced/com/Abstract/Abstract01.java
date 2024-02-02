/**
 * @author: 一只羊驼
 * @date: 2024/2/2
 */

package java_advanced.com.Abstract;

/**
 * 当父类的某些方法需要声明，但是不确定怎么实现
 * 就可以将他声明成抽象方法，这个类就是抽象类
 */
public class Abstract01 {
    public static void main(String args[]) {
//        Animal animal = new Animal("111");
        //1. 抽象类不能被实例化
        //2. 抽象类可以没有抽象方法，可以有实现方法
        //3. 抽象只能抽象类或者方法，不能修饰属性或者其他
        //4. 抽象类还是类，可以有其他成员、静态方法、构造器等
        //5. 抽象方法不能用 private,final,static修饰，这些字符都是和重写违背的
    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //这里的方法实现其实没有意义
    //也就是父类方法不确定
    //--》将父类方法变成抽象方法
    //--》抽象方法就是没有实现的方法，所谓没有实现，就是没有方法体
    //--》当一个类中存在抽象方法，需要将该类声明成abstract类
    //--》一般来说，抽象类会被集成，由子类来实现抽象方
//    public void eat(){
//        System.out.println("这是一个动物，但还不知道吃什么");
//    }
    public abstract void eat();
}