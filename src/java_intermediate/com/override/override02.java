/**
 * @author: 一只羊驼
 * @date: 2024/1/23
 */

package java_intermediate.com.override;

/**
 * 1. 编写一个Person类，包括属性/private (name、age)，构造器、方法say(返回自我介绍的字符串)
 * 2. 编写一个Student类，继承Person类，增加id、score属性/private，以及构造器，定义say方法(返回自我介绍的信息)。
 * 3. 在main中分别创建Person和Student对象，调用say方法输出自我介绍
 */

public class override02 {
    public static void main(String args[]) {
        Person p = new Person("linke", 100);
        Student s = new Student("linke", 100, 001, 100);
        System.out.println(p.say());
        System.out.println(s.say());
    }
}
