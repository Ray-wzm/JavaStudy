/**
 * @author: 一只羊驼
 * @date: 2024/1/15
 */

package java_obejct;

public class work01 {
    //1.编写类A01，定义方法max，实现求某个double数组的最大值，并返回
    public static void main(String args[]) {
        A01 a = new A01();
        double[] arr = {5.5, 8.7, 8.6, 3, 3};
        System.out.println("最大值是：" + a.max(arr));
    }
}

/**
 * 7.设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show0显示其信息并创建对象，进行测试，(提示 this.属性] Homework07.java
 * 9.定义Music类，里面有音乐名name、音乐时长times属性，并有播放play功能和返回本身属性信息的功能方法getlnfo.Homework09.java
 * 11.在测试方法中，调用method方法，代码如下，编译正确，试写出method方法的定义形式 ，调用语句为:!System.outprintln(method(method(10.0,20.0)100):Homework11.java
 * 12.创建一个Employee类，属性有(名字，性别，年龄，职位，薪水)， 提供3个构造可以初始化 (1) (名字，性别，年龄，职位，薪水),(2) (名字，性别，年龄) (3)方法，(职位，薪水),要求充分复用构造器 Homework12.java
 * 13.将对象作为参数传递给方法。 Homework13.java题目要求:(1)定义一个Circle类，包含一个double型的radius属性代表圆的半径，一findArea(方法返回圆的面积。(2) 定义一个类PassObject，在类中定义一个方法printAreas0，该方法的定义如下public void printAreas(Circle c, int times)//方法签名(3)在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。(4)在main方法中调用printAreas0方法，调用完毕后输出当前半径值。程序运行结果如图所示
 * 14.扩展题,学员自己做.Homework14.java.有个人 Tom 设计他的成员变量.成员方法,可以电脑猜拳电脑每次都会随机生成 0.1，20 表示 石头 1 表示剪刀 2 表示 布并要可以显示 Tom的输赢次数 (清单)
 */
class A01 {
    public double max(double[] arr) {
        double temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }
}