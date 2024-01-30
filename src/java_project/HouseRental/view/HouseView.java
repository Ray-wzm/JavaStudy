/**
 * @author: 一只羊驼
 * @date: 2024/1/30
 */

package java_project.HouseRental.view;

import java_project.HouseRental.Service.HouseService;
import java_project.HouseRental.Utils.Utility;
import java_project.HouseRental.model.House;

import java.util.Scanner;

public class HouseView {


    //显示主菜单
    private boolean loop = true;//控制显示菜单
    private char key = ' ';//定义用户选择动作
    private int choose = -2;//定义用户选择
    private char key2 = ' ';//定义用户选择动作
    private boolean lope1 = true;
    private HouseService houseService = new HouseService(10);//假定数组的大小为10
    Scanner scanner = new Scanner(System.in);

    //delHouse()调用del方法，按ID删除房屋
    public void delHouse() {
        System.out.println("======================删除房屋=====================");

        System.out.println("请输入要删除的房屋编号（-1退出）：");
        int choose = Utility.readInt();
        if (choose == -1) {
            System.out.println("你放弃了删除");
            return;
        }

        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (houseService.del(choose)) {
                System.out.println("=====================删除房屋成功====================");
            } else {
                System.out.println("=====================删除房屋失败====================");
            }

        } else {
            System.out.println("=====================放弃删除房屋====================");
        }

    }

    //addHouse()接受输入，创建House对象，调用Add方法
    public void addHouse() {
        System.out.println("======================添加房屋=====================");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phone = Utility.readString(12);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("当前状态（已出租/未出租）：");
        String states = Utility.readString(3);
        //创建一个新的House对象;ID 是系统产生的，用户不用输入
        House newHouse = new House(0, name, phone, address, rent, states);
        if (houseService.add(newHouse)) {
            System.out.println("=====================添加房屋成功====================");
        } else {
            System.out.println("=====================添加房屋失败====================");
        }
    }

    //编写listHouses()显示房屋列表
    public void listHouses() {
        System.out.println("======================房屋列表=====================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（已出租/未出租）");
        House[] houses = houseService.list();//得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("=====================房屋列表显示完毕================");
    }

    public void printMenu() {
        do {
            System.out.println("====================房屋出租系统===================");
            System.out.println("\t\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t\t6 退       出");
            System.out.println("请选择（1-6）：");
            key = scanner.next().charAt(0);//接收用户选择
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    System.out.println("======================查找房屋=====================");
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    System.out.println("修 改 房 屋 信 息");
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    System.out.println("退出");
                    return;
                default:
                    System.out.println("选择有误，请重新选择！");
            }

        } while (loop);
    }
}
