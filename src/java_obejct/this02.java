/**
 * @author: 一只羊驼
 * @date: 2024/1/15
 */

package java_obejct;

public class this02 {
    public static void main(String args[]) {
        Person02 p1 = new Person02("林克", 100);
        Person02 p2 = new Person02("林", 100);
        if (p1.compareTo(p2)) {
            System.out.println("一样");
        } else System.out.println("不一样");
    }
}

/***
 * 定义Person类，里面有name、age属性，并提供compareTo比较方法，用于判断是否和另一个人相等，
 * 提供测试类TestPerson用于测试,名字和年龄完全一样，就返回true,否则返回false
 * */

class Person02 {
    String name;
    int age;

    //定义一个构造器初始化数据
    public Person02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //比较方法，判断是否和另一个人相等
    public boolean compareTo(Person02 p) {
        return this.name.equals(p.name) && this.age == p.age;
    }

}

