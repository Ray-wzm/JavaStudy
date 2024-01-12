/**
 * @author: 一只羊驼
 * @date: 2024/1/12
 */

package java_obejct;

public class overload02 {
    public static void main(String args[]) {
        Methods m1 = new Methods();
        System.out.println(m1.m(2));
        System.out.println(m1.m(2, 3));
        m1.m("hello");
        System.out.println(m1.max(1, 2));
        System.out.println(m1.max(1.3, 453.5));
        System.out.println(m1.max(6.7, 9.5, 2.3));
        System.out.println(m1.max(6.7, 9.5, 12.3));
        System.out.println(m1.max(16.7, 9.5, 2.3));
    }
}

/**
 * 编写程序，类Methods中定义三个重载方法并调用。
 * 方法名为m。
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 * 在主类的main方法中分别用参数区别调用三个方法。
 */

class Methods {
    public int m(int n) {
        return n * n;
    }

    public int m(int n1, int n2) {
        return n1 * n2;
    }

    public void m(String n) {
        System.out.println(n);
    }

    /**
     * 在Methods类，定义三个重载方法max，
     * 第一个方法，返回两个int值中的最大值，
     * 第二个方法，返回两个double值中的最大值，
     * 第三个方法，返回三个double值中的最大值，
     * 并分别调用三个方法
     */
    public int max(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public double max(double n1, double n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public double max(double n1, double n2, double n3) {
        double temp = n1;
        if (n2 > temp && n2 > n3) {
            return n2;
        } else if (n3 > temp || n3 > n2) {
            return n3;
        } else return n1;
    }
}