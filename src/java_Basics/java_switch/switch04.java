/**
 * @author 一只羊驼
 * @date 2024/1/3
 */

package java_Basics.java_switch;

import java.util.Scanner;

public class switch04 {
    //打印月份所属的季节，3，4，5 春季；6，7，8 夏季；9，10，11 秋季；12，1，2 冬季
    public static void main(String args[]) {
        System.out.println("请输入月份1-12");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if (month >= 1 && month <= 12) {
            switch (month){
                case 3:
                case 4:
                case 5:
                    System.out.println("这是春季");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("这是夏季");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("这是秋季");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("这是冬季");
                    break;
            }
        } else {
            System.out.println("月份有误，重新输入！");
        }
    }
}
