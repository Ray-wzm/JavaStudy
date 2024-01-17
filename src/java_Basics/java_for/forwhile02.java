/**
 * @author: 一只羊驼
 * @date: 2024/1/4
 */

package java_Basics.java_for;

public class forwhile02 {
    //打印 99 乘法表
    public static void main(String args[]) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(i + " * " + j + " = " + j * i + "     ");
            }
            System.out.println();
        }

    }
}
