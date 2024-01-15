/**
 * @author: 一只羊驼
 * @date: 2024/1/15
 */

package java_obejct;

public class work05 {
    public static void main(String args[]) {
        //5.定义一个圆类Circle,定义属性:半径，提供显示圆周长功能的方法，提供显示圆面积的方法
        Circle c1 = new Circle(3);
        System.out.println(c1.perimeter(c1.radius));
        System.out.println(c1.area(c1.radius));
    }
}

class Circle{
    int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public double perimeter(int r){
        System.out.print("周长是：");
        return 2*3.14*r;
    }
    public double area(int r){
        System.out.print("面积是：");
        return 3.14*r*r;
    }
}