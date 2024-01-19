/**
 * @author: 一只羊驼
 * @date: 2024/1/19
 */

package java_intermediate.com.encap;


import java.util.Scanner;

public class accountTest {
    public static void main(String args[]) {
        System.out.println("输入密码：");
        Scanner scanner = new Scanner(System.in);
        account A = new account("jack",25,scanner.next());
        A.getInfo();
    }
}
