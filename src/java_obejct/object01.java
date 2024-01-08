/**
 * @author: 一只羊驼
 * @date: 2024/1/8
 */

package java_obejct;

public class object01 {
    public static void main(String args[]) {
        //类是抽象的，代表一类事物，是数据类型；对象是具体的，代表里面具体的实例
        //内存图中，栈一般存放基本数据类型，局部变量；堆存放对象，数组等；方法区（常量池：存放字符串等）、类加载信息

//        张老太养了两只猫猫:一只名字叫小白,今年3岁，白色；
//        还有一只叫小花，今年18岁,花色。
//        请编写一个程序，当用户输入小猫的名字时；
//        就显示该猫的名字，年龄，颜色。
//        如果用户输入的小猫名错误,则显示 张老太没有这只猫猫。
        Cat cat1=new Cat();//创建一只猫
        //cat1只是对象名称，new Cat（）才是真正的数据
        cat1.name="小白";
        cat1.age=3;
        cat1.color="白色";
        Cat cat2=new Cat();//创建第二只猫
        cat2=cat1;//将cat2指向cat1  //香港管党羽同一个人改了个名字，里面的内容一模一样
//        cat2.name="小花";
//        cat2.age=18;
//        cat2.color="花色";
        System.out.println("第一只猫的信息："+cat1.name+" ,"+cat1.age+" ,"+cat1.color);
        System.out.println("第二只猫的信息："+cat2.name+" ,"+cat2.age+" ,"+cat2.color);
    }
}

//自定义一个猫类
class Cat{
    String name; //名字
    int age; //年龄
    String color; //花色
}