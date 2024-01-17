/**
 * @author: 一只羊驼
 * @date: 2024/1/4
 */

package java_Basics.java_for;

public class while01 {
    public static void main(String args[]) {
        int i = 1;
        while (i<=10){
            System.out.print(i);
            i++;//循环变量不写，究极死循环
        }
    }
}
