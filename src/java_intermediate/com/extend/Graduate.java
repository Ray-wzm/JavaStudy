/**
 * @author: 一只羊驼
 * @date: 2024/1/20
 */

package java_intermediate.com.extend;
//大学生类-》模拟大学生考试的简单情况
public class Graduate extends student {
    public Graduate() {
        super("ray", 20, 90);
    }

    public void testing() {
        System.out.println("大学生：" + name + "正在考大学数学");
    }


    public void showInfo() {
        System.out.println("大学生：" + name + "，年龄：" + age + "，成绩：" + getScore());
    }
}
