/**
 * @author 一只羊驼
 * @date 2024/1/15
 */

package java_Basics.java_obejct;

public class work07 {
    public static void main(String args[]) {
        DogNew dog = new DogNew("Rainy", "black", 3);
        dog.show0();
    }
}

//7.设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show0显示其信息并创建对象，进行测试，(提示 this.属性)
class DogNew {
    String name;
    String color;
    int age;

    public DogNew(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show0() {
        System.out.print("小狗的名字是：" + this.name + "，颜色是：" + this.color + "，年龄是：" + this.age);
    }
}