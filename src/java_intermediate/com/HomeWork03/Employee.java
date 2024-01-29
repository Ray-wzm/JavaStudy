/**
 * @author: 一只羊驼
 * @date: 2024/1/29
 */

package java_intermediate.com.HomeWork03;

public class Employee {
    private double dailySalary; //每日工资
    private String name;
    private int workDay;//工作天数

    public Employee(double dailySalary, String name, int workDay) {
        this.dailySalary = dailySalary;
        this.name = name;
        this.workDay = workDay;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    /**
     * 打印工资
     */

    public void printSalary() {
        double salary = this.getDailySalary() * this.getWorkDay();
        System.out.println("员工" + this.getName() + " 工作了 " + this.getWorkDay() + "天，工资为：" + salary);
    }
}
