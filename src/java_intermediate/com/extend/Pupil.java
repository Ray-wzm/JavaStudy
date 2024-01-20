/**
 * @author: 一只羊驼
 * @date: 2024/1/20
 */

package java_intermediate.com.extend;

//小学生-》模拟小学生考试情况
public class Pupil extends student{

    public Pupil() {
        super("ray",10,100);
        System.out.println("子类构造器被调用");
    }

    public void testing() {
        System.out.println("小学生：" + name + "正在考小学数学");
    }

    public void showInfo() {
        System.out.println("小学生：" + name + "，年龄：" + age + "，成绩：" + getScore());
    }

}
