/**
 * @author: 一只羊驼
 * @date: 2024/1/4
 */

package java_Basics.java_for;

import java.util.Scanner;

public class forwhile01 {
    public static void main(String args[]) {
        //统计3个班的情况，每个班5名同学，统计每个班的平均分和整个年级的平均分，分数键盘输入
        Scanner scanner = new Scanner(System.in);
        double sum1 = 0;
        double sum2 = 0;
        int passNum = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("请输入第" + i + "个班的第" + j + "个同学的成绩：");
                double score = scanner.nextDouble();
                System.out.println("成绩为：" + score);
                sum1 += score;
                if (score >= 60) {
                    passNum++;
                }
            }
            System.out.println("第" + i + "个班的平均分是：" + sum1 / 5);
            sum2 += sum1;
            sum1 = 0;
        }
        System.out.println("整个年级的平均分是：" + sum2 / 15 + "，通过人数为：" + passNum);
    }
}
