/**
 * @author: 一只羊驼
 * @date: 2024/1/29
 */

package java_intermediate.com.HomeWork04;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * 存款
     * @param amount
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * 取款
     * @param amount
     */
    public  void withdraw(double amount) {
        balance -= amount;
    }
}
