/**
 * @author: 一只羊驼
 * @date: 2024/1/23
 */

package java_intermediate.com.override;

public class Student extends Person {
    /**
     * 2. 编写一个Student类，继承Person类，增加id、score属性/private，以及构造器，定义say方法(返回自我介绍的信息)
     */
    private int id;
    private double score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say() {
        return "我是" + getName() + ",我今年" + getAge() + "岁。,我是学生,学号是:" + getId() + ",分数是：" + getScore();
    }
}
