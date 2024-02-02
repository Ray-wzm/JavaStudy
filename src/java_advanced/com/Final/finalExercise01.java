/**
 * @author: 一只羊驼
 * @date: 2024/2/2
 */

package java_advanced.com.Final;

public class finalExercise01 {
    public static void main(String args[]) {
        /**
         * 编写一个程序，能够计算圆形面积，要求圆周率为3.14，赋值的位置3个方式都写
         */
        Circle circle = Circle.getInstance();
        System.out.println(circle.getSqure());
    }
}

class Circle{
    private static final double PI = 3.14;
    private double radious;
    private static Circle circle;

    private Circle(double radious) {
        this.radious = radious;
    }

    public static Circle getInstance(){
        if(circle==null){
            circle=new Circle(5);
        }
        return circle;
    }

    public static double getPI() {
        return PI;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public double getSqure(){
        return PI*getRadious()*getRadious();
    }
}
