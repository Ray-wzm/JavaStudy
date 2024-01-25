/**
 * @author 一只羊驼
 * @date 2024/1/25
 */

package java_intermediate.com.polyArray;

import java_intermediate.com.override.Person;

public class student extends person {
    private double score;

    public student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + ",sore=" + score;
    }

    //特有方法
    public void study(){
        System.out.println("学生"+getName()+"正在掉毛");
    }
}
