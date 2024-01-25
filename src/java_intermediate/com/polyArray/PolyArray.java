/**
 * @author 一只羊驼
 * @date 2024/1/25
 */

package java_intermediate.com.polyArray;

import java_intermediate.com.override.Person;
import java_intermediate.com.override.Student;

public class PolyArray {
    public static void main(String args[]) {
        /**
         * 1. 应用示例：现有一个继承结构如下：
         * 要求创建一个person对象、2个student对象和2个teacher对象，统一放在数组中，并调用每个对象的say方法
         */
        person[] persons = new person[5];//父类的引用可以指向子类的对象
        persons[0] = new person("jack", 20);
        persons[1] = new student("jack", 18, 100);
        persons[2] = new student("marry", 28, 90);
        persons[3] = new teacher("marry", 28, 10);
        persons[4] = new teacher("zelda", 18, 50);
        //循环遍历多态数组
        for (int i = 0; i < 5; i++) {
            System.out.println(persons[i].say()); //persons[i] 动态绑定,编译类型是 person ,运行类型由jvm来判断
            if (persons[i] instanceof student) {
                //判断person[i]的运行类型是不是student
                ((student) persons[i]).study();//向下转型
            } else if (persons[i] instanceof teacher) {
                //判断persons[i]的运行类型是不是teacher
                ((teacher) persons[i]).teach();//向下转型
            }
        }
//        student[] students = new student[2];
//        students[0] = (student) persons[1];
//        students[1] = (student) persons[2];
//        for (int i = 0; i < 2; i++) {
//            students[i].study();
//        }
    }
}
