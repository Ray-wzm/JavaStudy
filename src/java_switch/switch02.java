/**
 * @author 一只羊驼
 * @date 2024/1/3
 */

package java_switch;

import java.util.Scanner;

public class switch02 {
    public static void main(String args[]) {
        //使用switch将小写类型的char转换为大写，只转换a,b,c,d，其他输出other
        System.out.println("请输入一个小写字母（a-d）：");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        switch (letter){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            default:
                System.out.println("other");
        }
    }
}
