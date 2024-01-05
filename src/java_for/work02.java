/**
 * @author: 一只羊驼
 * @date: 2024/1/5
 */

package java_for;

import java.util.Scanner;

public class work02 {
    public static void main(String args[]) {
        //2.实现判断一个整数，属于哪个范围: 大于0;小于0;等于0
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println(num + "大于0！");
        } else if (num < 0) {
            System.out.println(num + "小于0！");
        } else {
            System.out.println(num + "等于0！");
        }
        //3. 判断一个年份是否为润年 能被4整除，不能被100整除，或者能被400整除
        if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
            System.out.println(num + "是闰年！");
        } else System.out.println(num + "不是闰年！");
        //        4.判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，
        //        其各个位上数字立方和等于其本身。312-3*100-1*10
        //        例如: 153 = 1*1*1 + 3*3*3 + 5*5*5
        System.out.println("请输入一个数：");
        int n1 = 0, n2 = 0, n3 = 0;
        int num2 = scanner.nextInt();
        n1 = num2 / 100;//百
        n2 = (num2 - n1 * 100) / 10;//十
        n3 = num2 - n1 * 100 - n2 * 10;//个
        if (num2 == (n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3)) {
            System.out.println(num2 + "是水仙花数！");
        }else System.out.println(num2 + "不是水仙花数！");
    }
}
