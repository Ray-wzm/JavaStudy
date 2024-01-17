/**
 * @author 一只羊驼
 * @date 2024/1/3
 */
package java_Basics.java_if;
import java.util.Scanner;

public class if05 {
    public static void main(String args[]) {
        //输入芝麻信用分，如果100输出“信用极好！”，（80-99]输出“信用优秀”，[60-80]输出信用一般，其他为不及格
        System.out.printf("请输入芝麻信用分（1-100）：");
        Scanner myScanner = new Scanner(System.in);
        int score = myScanner.nextInt();
        if (score > 1 && score <= 100) {
            if (score == 100) {
                System.out.println("你的芝麻信用分是" + score + ",信用极好！");
            } else if (score > 80 && score <= 99) {
                System.out.println("你的芝麻信用分是" + score + ",信用优秀！");
            } else if (score >= 60 && score <= 80) {
                System.out.println("你的芝麻信用分是" + score + ",信用一般！");
            } else {
                System.out.println("你的芝麻信用分是" + score + ",信用不及格！");
            }
        } else {
            System.out.println("数据错误，不在1-100范围内，请重新输入！");
        }

    }
}
