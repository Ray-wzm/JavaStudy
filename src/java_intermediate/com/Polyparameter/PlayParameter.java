/**
 * @author: 一只羊驼
 * @date: 2024/1/26
 */

package java_intermediate.com.Polyparameter;

public class PlayParameter {
    public static void main(String args[]) {
        Employee[] employees = new Employee[2];
        test t = new test();
        employees[0] = new worker("linke", 100);
        employees[1] = new employer("zelda", 150, 10);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getAnnual());
            t.showEmpAnnual(employees[i]);
            t.testWork(employees[i]);
        }
    }


}
