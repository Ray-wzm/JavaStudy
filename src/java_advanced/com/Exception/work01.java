/**
 * @author: 一只羊驼
 * @date: 2024/2/6
 */

package java_advanced.com.Exception;

import java.util.Scanner;

public class work01 {
    public static void main(String args[]) {
        int n1 = 0;
        int n2 = 0;
        String num1 = "";
        String num2 = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入除数（整数）：");
            num1 = scanner.next();
            try {
                n1 = Integer.parseInt(num1);
                System.out.println("请输入被除数（整数）：");
                num2 = scanner.next();
                n2 = Integer.parseInt(num2);
                System.out.println(EcmDef.cal(n1, n2));
                break;
            } catch (Exception e) {
                System.out.println("输入需要是个整数");
            }
        }


    }
}

class EcmDef {
    static int res = 0;

    public static int cal(int n1, int n2) {
        System.out.println(n1 + "/" + n2 + "=");

        try {
            res = n1 / n2;

        } catch (Exception e) {
            System.out.println("被除数不能是0！");
        }
        return res;


    }
}