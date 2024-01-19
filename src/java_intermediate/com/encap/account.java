/**
 * @author: 一只羊驼
 * @date: 2024/1/19
 */

package java_intermediate.com.encap;

public class account {
    public String name;//姓名 (公开的)
    private int balance;//余额 私有的
    private String password;//密码 私有的

    //一般都会配置两个构造器，一个无参构造器，一个有参的；

    public account() {
    }

    public account(String name, int balance, String password) {
        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //(长度为2位3位或4位)
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            this.name = "Nobody"; // 默认值
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= 20) {
            this.balance = balance;
        } else {
            this.balance = 20;
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 6) {
            this.password = password;
        } else {
            System.out.println("密码不能低于6位");
            this.password = "123456";
        }
    }

    public void getInfo(){
        System.out.println("姓名："+name+",余额："+balance);
    }
}

/**
 * 创建程序在其中定义两个类: Account和AccountTest类体会Java的封装性。
 * 1.Account类要求具有属性:
 * 姓名 (长度为2位3位或4位)
 * 余额(必须>20)
 * 密码(必须是六位)，如果不满足，则给出提示信息，并给默认值
 * 2.通过setXxx的方法给的Account 属性赋值。
 * 3.在AccountTest中测试
 */