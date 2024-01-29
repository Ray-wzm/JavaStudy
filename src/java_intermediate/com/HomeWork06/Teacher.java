/**
 * @author: 一只羊驼
 * @date: 2024/1/29
 */

package java_intermediate.com.HomeWork06;

public class Teacher extends Person {
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("我承诺，我会认真教学");
    }

    @Override
    public String play() {
        return (this.getName()+"爱玩象棋");
    }

    @Override
    public void printMessage() {
        super.printMessage();
        System.out.println("工龄："+getWork_age());
        this.teach();
        System.out.println(play());
        System.out.println("======================");
    }
}
