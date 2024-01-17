/**
 * @author: 一只羊驼
 * @date: 2024/1/4
 */

package java_Basics.java_for;

import java.util.Scanner;

public class for02 {
    public static void main(String args[]) {
        //打印1-100之间所有是9的倍数的数字，统计个数并计算和
        int count = 0;
        int sum = 0;
        //更改为可灵活的，引入start和end
        int start = 1;
        System.out.println("请输入一个数字：");
        Scanner scanner = new Scanner(System.in);
        int end = scanner.nextInt();
        for (int i = start; i <= end; i++) {
            if (i % 9 == 0) {
                System.out.println(i + "是9的倍数！");
                count += 1;
                sum += i;
            }
        }
        System.out.println("1-100中9的倍数的个数是：" + count);
        System.out.println("和是：" + sum);
    }
}
