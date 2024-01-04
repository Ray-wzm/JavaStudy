/**
 * @author: 一只羊驼
 * @date: 2024/1/4
 */

package java_for;

import java.util.Scanner;

public class forwhile03 {
    //打印金字塔
    public static void main(String args[]) {
       // System.out.println(" * ");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.printf(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
