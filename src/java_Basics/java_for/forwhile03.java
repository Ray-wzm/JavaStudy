/**
 * @author: 一只羊驼
 * @date: 2024/1/4
 */

package java_Basics.java_for;

import java.util.Scanner;

public class forwhile03 {
    //打印金字塔
    public static void main(String args[]) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入要打印的金字塔的高度：");
        int num = scanner.nextInt();
        for(int i=1;i<=num;i++){
            //打印空格
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            //打印实心金字塔
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
