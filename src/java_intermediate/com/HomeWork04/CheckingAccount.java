/**
 * @author: 一只羊驼
 * @date: 2024/1/29
 */

package java_intermediate.com.HomeWork04;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    /**
     * 存款
     * @param amount
     */
    public void deposit(double amount) {
        super.deposit(amount-1);// 收取1元手续费
    }

    /**
     * 取款
     * @param amount
     */
    public  void withdraw(double amount) {
        super.withdraw(amount-1);// 收取1元手续费
    }
}
