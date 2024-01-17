/**
 * @author 一只羊驼
 * @date 2024/1/3
 */

package java_Basics.java_switch;

import java.util.Scanner;

public class switch03 {
    public static void main(String args[]) {
        //成绩大于60的输出合格，低于60输出不合格
        System.out.println("请输入成绩：");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        //字符只要有值就可以，数字需要凑1
        if (score >= 0 && score <= 100) {
            switch ((int) (score / 60)) {
                case 1:
                    System.out.println("合格");
                    break;
                case 0:
                    System.out.println("不合格");
                    break;
//                default:
//                    System.out.println("输入不符合标准");
            }
        } else {
            System.out.println("输入不符合标准");
        }

    }
}
