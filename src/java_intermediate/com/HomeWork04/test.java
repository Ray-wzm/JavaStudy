/**
 * @author: 一只羊驼
 * @date: 2024/1/29
 */

package java_intermediate.com.HomeWork04;

public class test {
    public static void main(String args[]) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(100);
//        System.out.println(checkingAccount.getBalance());
//        checkingAccount.withdraw(100);
//        System.out.println(checkingAccount.getBalance());
        System.out.println("测试Saving");
        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());//1300
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());//1399
        savingAccount.earnMonthInterest();
        System.out.println(savingAccount.getBalance());
        savingAccount.withdraw(100);
        savingAccount.withdraw(100);
        savingAccount.withdraw(100);
        System.out.println(savingAccount.getBalance());//1300
    }
}
