/**
 * @author 一只羊驼
 * @date 2024/1/28
 */

package java_project.smallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通的各个功能的类
 * 将各个功能对应一个方法
 */
public class SmallChangeSysOOP {


    int i;
    //定义循环：是否还要循环显示，默认不输入4就一直循环
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    //定义空字符串用来接收明细
    String details = "";
    //定义充值金额和余额
    double money = 0;
    double balance = 0;
    //定义字符变量，接收用户选择，用于判断是否真的退出项目
    char choice;
    String note;//定义消费原因
    Date date = new Date();//引入Java.util.Date类记录当前时间
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//格式化 年-月-日 时：分：秒


    //1.先完成显示菜单，并可以选择
    public void mainMenu() {
        do {
            //打印菜单提示
            System.out.println("----------------选择零钱通菜单----------------");
            System.out.println("\t\t\t\t1 零钱通明细              ");
            System.out.println("\t\t\t\t2 收益入账                ");
            System.out.println("\t\t\t\t3 消费                   ");
            System.out.println("\t\t\t\t4 退     出              ");
            System.out.print("请选择（1-4）：");
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    this.detail();
                    break;
                case 2:
                    this.income();
                    break;
                case 3:
                    this.pay();
                    break;
                case 4:
                    this.quit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择！");
            }
        } while (loop);
    }

    //2.完成零钱通明细
    public void detail() {
        System.out.println(details);
    }

    //3.完成收益入账
    public void income() {
        System.out.println("收益入账金额：");
        money = scanner.nextDouble(); //接收用户传入收入
        //判断用户输入是否符合标准，收益不能是负数或者0
        //从错误条件入手，分支尽量少，可读性更强
        if (money <= 0) {
            System.out.println("数据有误！收支不能是负数！请重新选择或输入正确数据！");
            return;//退出方法，不再执行后面代码
        }
        balance += money;//余额增加
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t\t" + "余额\t" + balance;
        System.out.println();
    }

    //4.完成消费
    public void pay() {
        System.out.println("请输入消费金额：");
        money = scanner.nextDouble();
        System.out.println("请输入消费原因：");
        note = scanner.next();
        if (money <= 0 || balance < money) {
            System.out.println("消费金额应该在 1-" + balance);
            return;//退出方法，不再执行后面代码
        }
        balance -= money;
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t\t" + "余额\t" + balance;
        System.out.println();
    }

    //5.退出确认
    public void quit() {
        while (true) {
            System.out.println("确定要退出零钱通吗？（y/n）");
            choice = scanner.next().charAt(0);
            if (choice == 'y' || choice == 'n') {
                break;
            }
        }
        if (choice == 'y') {
            System.out.println("您已经成功退出零钱通项目");
            loop = false;
        }
    }
}
