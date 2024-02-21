/**
 * @author: 一只羊驼
 * @date: 2024/2/21
 */

package java_advanced.com.Arrays;

public class homework01 {
    public static void main(String args[]) {
        String name = "jack";
        String pwd = "123456";
        String email = "jack@163.com";
        try {
            userRegiater(name, pwd, email);
            System.out.println("注册成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void userRegiater(String name, String pwd, String email) {
        int userLength = name.length();
        if (!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("用户名长度为2-4");
        }
        if (!(pwd.length() == 6 && isDigtal(pwd))) {
            throw new RuntimeException("密码必须是6位数字");
        }
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱格式不对");
        }
    }

    public static boolean isDigtal(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
