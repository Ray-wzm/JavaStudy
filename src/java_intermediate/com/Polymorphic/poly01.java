/**
 * @author: 一只羊驼
 * @date: 2024/1/24
 */

package java_intermediate.com.Polymorphic;

public class poly01 {
    /**
     * 1. 方法的多态：利用方法的重载或重写实现多态
     * 2. 对象的多态：
     * （1）一个对象的编译类型和运行类型可以不一致。Animal animal = new Dog();父类的引用可以指向子类的对象，编译类型是Animal，运行类型是 dog
     * （2）编译类型在定义对象的时候就确定了，不能改变
     * （3）运行类型是可以改变的 Animal animal = new Cat();
     * （4）编译类型看定义时，等号的左边；运行类型看等号的右边
     * @param args
     */
    public static void main(String args[]) {
        Master tom = new Master("linke");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大棒骨");
        tom.feed(dog, bone);
        Cat cat = new Cat("奶牛");
        Fish fish = new Fish("黄花鱼");
        tom.feed(cat, fish);
        System.out.println("===============");
        System.out.println("测试对象的多态");
        //测试对象的多态
        //编译类型就是 Animal，运行类型是 Dog
        Animal animal = new Dog("小黄");
        //编译类型就是 Food，运行类型是 Bone
        Food food = new Bone("骨头渣");
        //执行到本行代码，运行类型是Dog和Bone
        tom.feed(animal,food);
        //编译类型不能改变，运行类型可以修改，更改指向
        animal = new Cat("猪猪");
        food = new Fish("大鲤鱼");
        //执行到本行代码，运行类型是Cat和Fish
        tom.feed(animal,food);
        //向上转型（就是父类提供指向子类的引用）
        //1. 可以调用父类的所有成员、方法；遵守范围
        //2. 不能调用子类的特有成员、方法 animal.say() 不能调用
        //3. 最终运行效果，要看子类的实现；也就是调用方法时，从子类开始向上向父类找方法
        animal.say();//因为现在的运行类型是cat，cat类下没有say方法，所以向上找到他的父类Animal,animal有say方法，所以输出动物叫
        //规则和方法的调用规则一致

        //向下转型（强制转化：解决向上转型后想要访问到子类特有成员的问题）
        //1. 编译类型是 Cat，运行类型也是 Cat
        Cat cat_p = (Cat)animal;
        cat_p.say();
        //2. 向下转型，要求父类引用必须指向当前运行类型的对象；就类似于你给一个人换个名字或者是身份，人永远是哪个人，不能变；
        // Dog dog_p = (Dog)animal; //不能尝试将一个指向猫对象的引用，指向狗；
        // java.lang.ClassCastException: 强制类型转换错误
        //细节！
        //(1)属性没有重写的说法，方法才可以；属性的值看编译类型所属类的值
        //当前对象的编译类型仍然是Animal，Animal 的 age 是 10
        System.out.println(animal.age);
        // instanceof ,用于判断对象的运行类型是否是XX类型，或者XX类型的子类型
        System.out.println(cat instanceof Animal);//true
        System.out.println(animal instanceof Cat);//true
    }
}
