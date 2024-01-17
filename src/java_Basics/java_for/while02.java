/**
 * @author: 一只羊驼
 * @date: 2024/1/4
 */

package java_Basics.java_for;

import java.util.Scanner;

public class while02 {
    //打印 1-100 所有能被3整除的数
    public static void main(String args[]) {
        Scanner scanner1 = new Scanner(System.in);
        int num = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int end = scanner2.nextInt();
        int i = 1;
        while (i <= end) {
            if (i % num == 0) {
                System.out.println(i + "能被" + num + "整除！");
            }
            i++;
        }
        //打印40-200之间所有的偶数
        int num3 = scanner1.nextInt();
        int num4 = scanner2.nextInt();
        i = 1;
        while (i <= num4) {
            if (i >= num3 && i % 2 == 0) {
                System.out.println(i + "是偶数！");
            }
            i++;
        }
    }
}
