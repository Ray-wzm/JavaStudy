/**
 * @author: 一只羊驼
 * @date: 2024/1/29
 */

package java_intermediate.com.HomeWork03;

public class Manager extends Employee {
    private double level=1.2;

    public Manager(double dailySalary, String name, int workDay) {
        super(dailySalary, name, workDay);
    }



    @Override
    public void printSalary() {
        double salary = 1000 + this.getDailySalary() * this.getWorkDay() * this.level;
        System.out.println("经理" + this.getName() + " 工作了 " + this.getWorkDay() + "天，工资为：" + salary);
    }
}
