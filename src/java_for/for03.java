/**
 * @author: 一只羊驼
 * @date: 2024/1/4
 */

package java_for;

import java.util.Scanner;

public class for03 {
    //    0+5=5
//    1+4=5
//    2+3=5
//    3+2=5
//    4+1=5
//    5+0=5
    public static void main(String args[]) {
        Scanner scanner1 = new Scanner(System.in);
        int num = scanner1.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i + "+" + (num - i) + "=" + num);
        }
    }
}
