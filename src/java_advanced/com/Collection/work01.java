/**
 * @author: 一只羊驼
 * @date: 2024/2/22
 */

package java_advanced.com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class work01 {
    @SuppressWarnings("all")
    public static void main(String args[]) {
        List list = new ArrayList();
        list.add(new Dog("puppy", 2));
        list.add(new Dog("anna", 3));
        list.add(new Dog("apple", 4));

        //增强 for
        System.out.println("====增强For====");
        for (Object dog : list) {
            System.out.println("Dog=" + dog);
        }
        //迭代器
        System.out.println("====迭代器====");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("Dog=" + obj);
        }
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}