/**
 * @author: 一只羊驼
 * @date: 2024/1/26
 */

package java_intermediate.com.Polyparameter;

public class employer extends Employee {
    private double bonus;//奖金

    public employer(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("经理在布置任务");
    }

    @Override
    public double getAnnual() {
        System.out.println("经理" + getName() + "年薪");
        return super.getAnnual() + getBonus();
    }
}
