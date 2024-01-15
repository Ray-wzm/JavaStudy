/**
 * @author 一只羊驼
 * @date 2024/1/15
 */

package java_obejct;

public class work09 {
    public static void main(String args[]) {
        Employee e1 = new Employee("Ray", '女', 24, 1, 10);
    }
}

//创建一个Employee类，属性有(名字，性别，年龄，职位，薪水)，
// 提供3个构造可以初始化 (1) (名字，性别，年龄，职位，薪水),(2) (名字，性别，年龄) (3)方法，(职位，薪水)
// 要求充分复用构造器

class Employee {
    String name;
    char sex;
    int age;
    int level;
    int money;

    //(名字，性别，年龄，职位，薪水)
    public Employee(String name, char sex, int age, int level, int money) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.level = level;
        this.money = money;
    }

    //(名字，性别，年龄)
    public Employee(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    //(名字，性别，年龄，职位，薪水)
    public Employee(int level, int money) {
        this.level = level;
        this.money = money;
    }

}