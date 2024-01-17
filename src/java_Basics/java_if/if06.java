/**
 * @author 一只羊驼
 * @date 2024/1/3
 */

package java_Basics.java_if;

import java.util.Scanner;

public class if06 {
    public static void main(String args[]) {
        //参加歌手比赛，初赛成绩大于8.0的进入决赛，否则提示淘汰，并且根据性别提示进入男子组或女子组。输入成绩和性别，进行判断和输出信息。
        System.out.println("请输入成绩和性别：");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        double score = scanner1.nextDouble();
        //charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。scanner本身不支持char接收
        char gender = scanner2.next().charAt(0);
        if (score >= 8.0) {
            if (gender == '男') {
                System.out.println("恭喜进入男子组决赛！");
            } else if (gender == '女') {
                System.out.println("恭喜进入女子组决赛！");
            } else {
                System.out.println("性别输入有误，请重新输入。。");
            }
        } else {
            System.out.println("很遗憾您未进入决赛！");
        }
    }
}
