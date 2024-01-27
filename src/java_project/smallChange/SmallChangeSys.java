/**
 * @author 一只羊驼
 * @date 2024/1/27
 */

package java_project.smallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

    //先完成显示菜单，并可以选，给出对应提示
    public static void main(String args[]) {
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
        do {
            //打印菜单提示
            System.out.println("----------------零钱通菜单----------------");
            System.out.println("\t\t\t\t1 零钱通明细              ");
            System.out.println("\t\t\t\t2 收益入账                ");
            System.out.println("\t\t\t\t3 消费                   ");
            System.out.println("\t\t\t\t4 退     出              ");
            System.out.print("请选择（1-4）：");
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("----------------零钱通明细----------------");
                    System.out.println(details);
                    break;
                case 2:
                    System.out.println("收益入账金额：");
                    money = scanner.nextDouble(); //接收用户传入收入
                    //判断用户输入是否符合标准，收益不能是负数或者0
                    //从错误条件入手，分支尽量少，可读性更强
                    if (money <= 0) {
                        System.out.println("数据有误！收支不能是负数！请重新选择或输入正确数据！");
                        break;
                    }
                    balance += money;//余额增加
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t\t" + "余额\t" + balance;
                    System.out.println();
                    break;
                case 3:
                    System.out.println("请输入消费金额：");
                    money = scanner.nextDouble();
                    System.out.println("请输入消费原因：");
                    note = scanner.next();
                    if (money <= 0 || balance > money) {
                        System.out.println("消费金额应该在 1-" + balance);
                        break;
                    }
                    balance -= money;
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t\t" + "余额\t" + balance;
                    System.out.println();
                    break;
                case 4:
                    int index = 0;
//                    尽量每个功能模块分开写，可读性高一些
//                    while (true){
//                        System.out.println("确定要退出零钱通吗？（y/n）");
//                        choice=scanner.next().charAt(0);
//                        if(choice=='y'||choice=='n'){
//                            break;
//                        }
//                    }
                    do {
                        System.out.println("确定要退出零钱通吗？（y/n）");
                        choice = scanner.next().charAt(0);
                        //输入必须是y/n，否则无限循环
                        if (choice == 'y') {
                            System.out.println("您已经成功退出零钱通项目");
                            return;
                        } else if (choice == 'n') {
                            index = -1;
                        } else {
                            System.out.println("请正确输入（y/n）！");
                        }
                    } while (index != -1);
                    break;
                //不要忘记可以写个default!!
                default:
                    System.out.println("选择有误，请重新选择！");
            }
        } while (loop);


    }
}
