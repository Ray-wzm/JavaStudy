/**
 * @author 一只羊驼
 * @date 2024/1/3
 */

package java_Basics.java_switch;

import java.util.Scanner;

//输入a,b,c,d，分别对应 a:林克；b：波克布林；c：猪布林；d:盖浓
public class switch01 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符(a-d)");
        char choice = scanner.next().charAt(0);
        //只要是值就是表达式
        switch (choice) {
            case 'a':
                System.out.println("林克");
                break;
            case 'b':
                System.out.println("波克布林");
                break;
            case 'c':
                System.out.println("猪布林");
                break;
            case 'd':
                System.out.println("盖浓");
                break;
            default:
                System.out.println("未匹配到值，请检查输入！");
        }
        System.out.println("退出switch，程序继续执行");
    }
}
