/**
 * @author 一只羊驼
 * @date 2024/1/25
 */

package java_intermediate.com.polyArray;

import java_intermediate.com.override.Person;

public class teacher extends person {
    private double salary;

    public teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + ",salary=" + salary;
    }
    //特有方法
    public void teach(){
        System.out.println("老师"+getName()+"在授课");
    }
}
