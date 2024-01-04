/**
 * @author: 一只羊驼
 * @date: 2024/1/4
 */

package java_for;
import java.util.Scanner;

public class while03 {
    public static void main(String args[]) {
        int i = 1;
        int sum = 0;
        //do while for括号内条件判断都是满足就继续执行
        do {
            System.out.println(i);
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println("sum=" + sum);
        //统计1-200之间能被5整除，但不能被3整除的数的个数
        i = 1;
        sum = 0;
        do {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(i + "能被5整除，不能被3整除！");
                sum += 1;
            }
            i++;
        } while (i <= 200);
        System.out.println("满足能被5整除，不能被3整除的个数为：" + sum);
        Scanner scanner = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("债主对你使出暴揍！");
            System.out.println("还钱吗？（y/n）");
            answer = scanner.next().charAt(0);
            System.out.println("你的回答是：" + answer);
        } while (answer == 'n');
    }
}
