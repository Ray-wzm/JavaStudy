/**
 * @author: 一只羊驼
 * @date: 2024/1/29
 */

package java_intermediate.com.HomeWork06;

public class Student extends Person{
    private int stu_id;

    public Student(String name, char sex, int age, int stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println("我承诺，我会好好学习");
    }

    public String play(){
        return (this.getName()+"爱玩足球");
    }

    @Override
    public void printMessage() {
        super.printMessage();
        System.out.println("学号："+getStu_id());
        this.study();
        System.out.println(play());
        System.out.println("======================");
    }
}
