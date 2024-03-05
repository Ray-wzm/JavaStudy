/**
 * @author: 一只羊驼
 * @date: 2024/3/4
 */

package java_advanced.com.Generic;

import java.util.ArrayList;

@SuppressWarnings("all")
public class generic01 {
    public static void main(String args[]) {
//      ArrayList list = new ArrayList();
        ArrayList<Dog> list = new ArrayList<Dog>();
        list.add(new Dog("旺财", 10));
        list.add(new Dog("发财", 1));
        list.add(new Dog("有财", 6));
//        list.add(new Cat("有财",6));
        //假设不小心加进来了一只猫，但是编译器是发现不了的，Object类型可以完美包含
        //要频繁向下转型才能获取到数据
        for (Dog obj : list) {
//            Dog dog = (Dog) obj;
            //可以直接用dog类型，不用向下转型
            System.out.println(obj);
        }
        personT<String> stringpersonT = new personT<String>("Ray");
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class personT<E> {
    E s;

    public personT(E s) {
        this.s = s;
    }

    public E f() {
        return s;
    }
}