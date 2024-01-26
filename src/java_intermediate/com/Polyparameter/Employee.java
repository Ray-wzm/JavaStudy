/**
 * @author: 一只羊驼
 * @date: 2024/1/26
 */

package java_intermediate.com.Polyparameter;

public class Employee {
    private String name;
    private double salary;//月工资

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnual() {
        return 12 * getSalary();
    }
}
