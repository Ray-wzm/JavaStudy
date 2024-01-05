/**
 * @author: 一只羊驼
 * @date: 2024/1/5
 */

package java_for;

public class work01 {
    public static void main(String args[]) {
//        1.编程实现如下功能
//        某人有100,000元,每经过一次路口，
//        需要交费,规则如下:
//        1)当现金>50000时,每次交5%
//        2)当现金<=50000时每次交1000
//        编程计算该人可以经过多少次路口
//        要求: 使用 while break方式完成
        int root = 0;
        double money = 100000;
        while (money >= 0) {
            if (money > 50000) {
                money = money * (1 - 0.05);
                root += 1;
            } else if (money >= 1000 && money <= 50000) {
                //(money >= 1000 && money <= 50000)
                money -= 1000;
                root += 1;
            } else break;
        }
        System.out.println("可以通过几个路口：" + root);
    }
}
