/**
 * @author: 一只羊驼
 * @date: 2024/1/26
 */

package java_intermediate.com.Polyparameter;

public class worker extends Employee {
    public worker(String name, double salary) {
        super(name, salary);
    }

    //特有方法
    public void work() {
        System.out.println("普通员工" + getName() + "在工作");
    }

    @Override
    public double getAnnual() {
        System.out.println("普通员工" + getName() + "年薪");
        return super.getAnnual();
    }
}
