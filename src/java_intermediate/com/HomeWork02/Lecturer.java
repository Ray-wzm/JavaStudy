/**
 * @author 一只羊驼
 * @date 2024/1/28
 */

package java_intermediate.com.HomeWork02;

public class Lecturer extends Teacher {
    public Lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("讲师" + this.getName() + ",年龄：" + this.getAge() + ",职级" + getPost() + ",工资" + getSalary());
    }
}
