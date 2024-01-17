/**
 * @author: 一只羊驼
 * @date: 2024/1/12
 */

package java_Basics.java_obejct;

public class overload01 {
    public static void main(String args[]) {
        Caculator myCaculator = new Caculator();
        System.out.println(myCaculator.caculate(1, 6.8));
        System.out.println(myCaculator.caculate(1, 68));
        System.out.println(myCaculator.caculate(1, 6, 8));
        System.out.println(myCaculator.caculate(1.1, 6));
    }
}


//允许同一个类中，有多个同名方法，但是形参不能一样
//减少了起名记名的麻烦
//方法名必须相同，形参的类型、个数、顺序至少有一个不同，参数名不做要求
class Caculator {
    //下面的四个 caculate 方法构成了重载

    public int caculate(int n1, int n2) {
        return n1 + n2;
    }

    public double caculate(int n1, double n2) {
        return n1 + n2;
    }

    public double caculate(double n1, int n2) {
        return n1 + n2;
    }

    public int caculate(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}