/**
 * @author: 一只羊驼
 * @date: 2024/1/9
 */

package java_Basics.java_obejct;

public class method02 {
    public static void main(String args[]) {
        //编写一个方法copyPerson，可以复制一个Person对象，返回复制的对象。克隆对象,
        //注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
        Person P = new Person();
        P.name = "Ray";
        P.age = 10;
        tools t = new tools();
        Person P2 = t.copyPerson(P);//至此，P和P2都是Person的两个独立的对象，只是属性相同；独立对象内的数改变，不影响其他对象
        System.out.println("P1:" + P.age + P.name);
        System.out.println("P2:" + P2.age + P2.name);
    }
}

class Person {
    String name;
    int age;
}

class tools {
    //编写一个方法copyPerson，可以复制一个Person对象，返回复制的对象。克隆对象,
    //注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
    //1. 方法的返回类型是person
    //2. 方法的名字是copyPerson
    //3. 方法的形参是person P
    public Person copyPerson(Person P) {
        Person P2 = new Person();
        P2.name = P.name;
        P2.age = P.age;
        return P2;
    }
}