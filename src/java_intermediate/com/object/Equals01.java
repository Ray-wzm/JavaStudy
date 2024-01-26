/**
 * @author: 一只羊驼
 * @date: 2024/1/26
 */

package java_intermediate.com.object;

public class Equals01 {
    public static void main(String args[]) {
//        A obj1 =new A();
//        A obj2 =new A();
//        System.out.println(obj1.i==obj1.j);
//        System.out.println((obj1).equals(obj2));
//        //equals源码怎么查看：ctrl+b
//        "string".equals("abc");

        Person person1 = new Person("jack", 10, '男');
        Person person2 = new Person("jack", 10, '男');
        System.out.println(person1.equals(person2));
        System.out.println(person1.toString());
        System.out.println(person1);//当直接输出一个对象时，Monster方法会被默认调用
    }
}

class A {
    int i = 10;
    double j = 10;
}

class Person {
    private String name;
    private int age;
    private char gender;

    //toString一般都是要被重写的
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        //如果比较的两个对象是同一个，直接返回true
        if (this == obj) {
            return true;
        }
        //重写equals方法，判断接受的对象如果是 Person
        if (obj instanceof Person) { // 是Person才会进行比较
            Person p = (Person) obj;//向下转型
            //因为想要拿到Person的属性
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;

        }
        //如果不是Person，直接false
        return false;
    }
}