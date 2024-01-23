/**
 * @author: 一只羊驼
 * @date: 2024/1/23
 */

package java_intermediate.com.override;

public class Person {
    /**
     * 1. 编写一个Person类，包括属性/private (name、age)，构造器、方法say(返回自我介绍的字符串)
     */
    private String name;
    private int age;

    public Person(String name, int age) {
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

    public String say() {
        return "我是" + getName() + ",我今年" + getAge() + "岁。";
    }
}
