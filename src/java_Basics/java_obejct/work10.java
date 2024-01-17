/**
 * @author 一只羊驼
 * @date 2024/1/15
 */

package java_Basics.java_obejct;

public class work10 {
    public static void main(String args[]) {
        CircleNew c1 = new CircleNew();
        PassObject obj = new PassObject();
        obj.printAreas(c1, 5);
    }
}

//将对象作为参数传递给方法。题目要求:
// (1)定义一个Circle类，包含一个double型的radius属性代表圆的半径，一findArea(方法返回圆的面积
// (2) 定义一个类PassObject，在类中定义一个方法printAreas0，
// 该方法的定义如下public void printAreas(Circle c, int times)//方法签名
// (3)在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积
// 例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
// (4)在main方法中调用printAreas0方法，调用完毕后输出当前半径值。
// 程序运行结果如图所示

class CircleNew {
    double radius; // 圆的半径

    //findArea方法，返回圆的面积
    public double findArea(CircleNew c) {
        return Math.PI * (this.radius) * (this.radius);
    }

}

class PassObject {
    public void printAreas(CircleNew c, int times) {
        for (int i = 1; i <= times; i++) {
            c.radius = i;
            System.out.println("当半径是：" + (double) i + "时, 面积是：" + c.findArea(c));
        }
    }
}
