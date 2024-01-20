/**
 * @author: 一只羊驼
 * @date: 2024/1/20
 */

package java_intermediate.com.extend;
//父类，pupil和graduate的父类
public class student {
    public String name;
    public int age;
    private double score;


    //当创建子类对象的时候，不管使用子类的哪个构造器，默认情况下总会调用父类的无参构造器。
    //如果父类没有提供无参构造器，则必须在子类构造器中用super指定使用父类的哪个构造器，完成对父类的初始化
    public student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    //1. 非私有的属性和方法，可以在子类中直接访问；私有的属性和方法，需要父类提供公共的方法去访问
    //2. 子类必须调用父类的构造器，完成父类的初始化
    //3.
    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }


}
