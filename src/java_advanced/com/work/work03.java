/**
 * @author: 一只羊驼
 * @date: 2024/2/5
 */

package java_advanced.com.work;

public class work03 {
    public static void main(String args[]) {
        Animal animal = new Cat();
        animal.shout();
        Animal animal1 = new Dog();
        animal1.shout();
    }
}

abstract class Animal {
    abstract public void shout();
}

class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}

class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}