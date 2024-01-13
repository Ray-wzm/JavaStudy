/**
 * @author 一只羊驼
 * @date 2024/1/13
 */

package java_obejct;

public class varParameter02 {
    public static void main(String args[]) {
        HspMethod2 method2 = new HspMethod2();
        double[] arr1 = {89.5, 99};
        double[] arr2 = {66.5, 89.5, 99};
        double[] arr3 = {100, 76, 85, 89.5, 99};
        method2.showScore("小王", arr1);
        method2.showScore("小李", arr2);
        method2.showScore("小张", arr3);
    }
}

/*
 * 有三个方法，分别实现返回姓名和两门课成绩总分，返回姓名和三门课成绩总分，返回姓名和五门课成绩总分。
 * 封装成一个可变参数的方法。
 */
class HspMethod2 {
    public void showScore(String name, double... score) {
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println(name + "同学，" + score.length + "门课程的总分是：" + sum);
    }
}
