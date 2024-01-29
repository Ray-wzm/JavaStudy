/**
 * @author: 一只羊驼
 * @date: 2024/1/29
 */

package java_intermediate.com.HomeWork03;

public class test {
    public static void main(String args[]) {
        Employee employee = new Staff(100, "linke", 3);
        Employee employee1 = new Manager(120, "zelda", 3);
        employee.printSalary();
        employee1.printSalary();
    }
}
