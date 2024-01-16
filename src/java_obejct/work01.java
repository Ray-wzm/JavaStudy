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
        double[] arr1 = {};
        Double res = a.max(arr1);
        if (res != null) {
            System.out.println("最大值是：" + res);
        } else {
            System.out.println("请输入至少一个数！");
        }
    }
}

//代码写完，实现业务后，要考虑代码健壮性！
class A01 {
    public Double max(double[] arr) {
        //数组不能为null或者长度为0
        if (arr != null && arr.length > 0) {
            double temp = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (temp < arr[i]) {
                    temp = arr[i];
                }
            }
            return temp;
        } else {
            return null;
        }


    }
}