/**
 * @author: 一只羊驼
 * @date: 2024/2/2
 */

package java_advanced.com.Abstract;

public class Abstract02 {
    public static void main(String args[]) {
        Employee employee1=new Manager("Zelda",10,200,100);
        Employee employee2=new CommonEmployee("link",11,100);
        employee1.work();
        employee2.work();
    }
}
abstract class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    abstract public void work();

}

class Manager extends Employee{
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理正在工作...");
    }
}

class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工在工作...");
    }
}