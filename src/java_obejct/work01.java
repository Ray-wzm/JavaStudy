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