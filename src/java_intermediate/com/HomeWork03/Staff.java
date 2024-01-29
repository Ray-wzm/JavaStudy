/**
 * @author: 一只羊驼
 * @date: 2024/1/29
 */

package java_intermediate.com.HomeWork03;

public class Staff extends Employee {
    private double level =1.0;

    public Staff(double dailySalary, String name, int workDay) {
        super(dailySalary, name, workDay);
    }

    @Override
    public void printSalary() {
        double salary = this.getDailySalary() * this.getWorkDay() * this.level;
        System.out.println("普通员工" + this.getName() + " 工作了 " + this.getWorkDay() + "天，工资为：" + salary);
    }
}
