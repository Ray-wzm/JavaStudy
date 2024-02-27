/**
 * @author: 一只羊驼
 * @date: 2024/2/27
 */

package java_advanced.com.Collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@SuppressWarnings("all")
public class HashSetExercise {
    /**
     * 定义一个Employee类，该类包含:private成员属性name,age 要求:
     * 1.创建3个Employee 放入 HashSet中
     * 2.当 name和age的值相同时，认为是相同员工,不能添加到HashSet集合中
     *
     * @param args
     */
    public static void main(String args[]) {
        Set hashSet = new HashSet();
        hashSet.add(new Employee("Ray", 10));
        hashSet.add(new Employee("Link", 100));
        hashSet.add(new Employee("Zelda", 100));
        hashSet.add(new Employee("Ray", 10));
        System.out.println("hashSet="+hashSet);

    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
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
        return "员工姓名：" + name + '\'' +
                ", 员工年龄：" + age+"\n";
    }

    /**
     * 如果名字和年龄都相同，则返回相同的 hashCode值
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}