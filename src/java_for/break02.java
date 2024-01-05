/**
 * @author: 一只羊驼
 * @date: 2024/1/5
 */

package java_for;

import java.util.Scanner;

public class break02 {
    public static void main(String args[]) {
        //实现登陆验证，有3次机会，如果用户名为“林克”，密码54312，提示验证成功，准备开塔，否则提示恭喜召唤几只人马
        Scanner scanner1 = new Scanner(System.in);
        int chance = 3;

        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名和密码：");
            String name = scanner1.next();
            //字符串的比较需要用equals
            //推荐将变量放到equals方法里面，这种可以避免空指针
            int password = scanner1.nextInt();
            if ("林克".equals(name)&& password == 54312) {
                System.out.println("验证成功，准备开塔");
                break;
            } else {
                chance--;
                System.out.println("恭喜召唤" + i + "只人马,还有"+chance+"次机会！");
            }
        }
    }
}
