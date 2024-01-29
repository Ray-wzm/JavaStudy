/**
 * @author: 一只羊驼
 * @date: 2024/1/29
 */

package java_intermediate.com.HomeWork04;

public class SavingAccount extends BankAccount {
    private int count=3;
    private double rate = 0.01;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount - 1);
        }
        count--;
    }

    public void earnMonthInterest() {
        //每个月统计上个月利息，重置Count
        count = 3;
        super.deposit(getBalance() * rate);
    }
}
