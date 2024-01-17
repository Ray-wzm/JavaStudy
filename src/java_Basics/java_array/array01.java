/**
 * @author 一只羊驼
 * @date 2024/1/6
 */

package java_Basics.java_array;

import java.util.Scanner;

public class array01 {
    public static void main(String args[]) {
        //数组是引用类型，数组可以存放多个同一类型的数据
        //养鸡场有6只鸡，求平均体重
        //double[] 表示 是double类型的数组
        //double[] 数组名  == double 数组名[]
        double[] weight = new double[6];
        double totalWeight = 0;
        System.out.println("请输入6只小鸡的体重：");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < weight.length; i++) {
            weight[i] = scanner.nextDouble();
            totalWeight += weight[i];
            System.out.printf("第" + (i + 1) + "只小鸡的体重是:" + weight[i] + "\n");
        }
        double avgWeight = totalWeight / 6.0;
        System.out.printf("6只小鸡的平均体重是：" + avgWeight);
    }
}
