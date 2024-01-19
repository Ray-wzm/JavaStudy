/**
 * @author: 一只羊驼
 * @date: 2024/1/19
 */

package java_intermediate.com.encap;

import java.util.Scanner;

public class encapsulation01 {
    public static void main(String args[]) {
        person p = new person("jack", 20, 10000);
        p.getInfo();
    }
}

//封装的实现
//1. 将属性进行私有化 private(不能直接修改属性)
//2. 提供一个公共的Set方法，用于对属性判断并赋值
//3. 提供一个公共的get方法，用于获取属性的值

//不能随便查看工资，年龄需要在0-110之间，姓名 2-6个字符
class person {
    public String name;//定义名字 公开的
    private int age;//定义年龄
    private double salary;//定义工资


//给每个属性都配置 get和insert方法，可以用ALT+Insert快捷键

    //构造器需要结合set方法，才能实现控制
    public person(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //名字必须 2- 6 个字符
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("名字参数错误！");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //年龄在0-110
        if (age >= 0 && age <= 110) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("年龄数据错误！");
        }
    }

    public Double getSalary() {
        //可以增加权限判断，密码校验等
        String password = "hik12345+";
        System.out.println("薪资敏感，请输入密码");
        Scanner scanner = new Scanner(System.in);
        if (password.equals(scanner.next())) {
            return salary;
        } else {
            System.out.println("密码错误！");
        }
        return null;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法，返回属性信息
    public void getInfo() {
        System.out.println("姓名：" + name + "，年龄：" + age);
        System.out.println("薪资：" + getSalary());
    }
}