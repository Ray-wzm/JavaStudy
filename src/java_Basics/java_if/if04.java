/**
 * @author 一只羊驼
 * @date 2024/1/3
 */
package java_Basics.java_if;
import java.util.Scanner;

public class if04 {
    public static void main(String args[]) {
        //判断一个年份是否是闰年，闰年的条件是符合下面两者之一：
        //（1）年份能被4整除，但不能被100整除；（2）能被400整除
        System.out.print("请输入年份：");
        Scanner myScanner = new Scanner(System.in);
        int year = myScanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "是闰年!");
        } else System.out.println(year + "不是闰年！");
    }
}
