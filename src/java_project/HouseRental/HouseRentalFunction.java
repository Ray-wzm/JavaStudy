/**
 * @author: 一只羊驼
 * @date: 2024/1/29
 */

package java_project.HouseRental;

import java.util.Scanner;

public class HouseRentalFunction {

    //1. 显示主菜单，并可以选择
    int choice;//定义用户选择动作
    Scanner scanner = new Scanner(System.in);

    private String name;//房主姓名
    private String PhoneNumber;//手机号
    private String location;//地址
    private double rent;//租金
    private String status;//状态（已出租/未出租）
    private int number=0;//编号

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "姓名：" + name + '\n' +
                "电话：" + PhoneNumber + '\n' +
                "地址：" + location + '\n' +
                "月租：" + rent + '\n' +
                "状态（已出租/未出租）：" + status;
    }

    /**
     * 添加房屋
     */
    public void addHouse() {
        System.out.print("姓名：");
        name = scanner.next();
        System.out.print("电话：");
        PhoneNumber = scanner.next();
        System.out.print("地址：");
        location = scanner.next();
        System.out.print("月租：");
        rent = scanner.nextDouble();
        System.out.print("状态（已出租/未出租）：");
        status = scanner.next();
        number++;
    }

    /**
     * 查找房屋  要放数组里。。
     */
    int searchNum;
    public void searchHouse(){
        System.out.print("请输入你要查找的ID：");
        searchNum=scanner.nextInt();
        if(searchNum==number){

        }
    }

    /**
     * 打印菜单
     */
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
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("======================添加房屋=====================");
                    this.addHouse();
                    System.out.println("======================添加完成=====================\n");
                    break;
                case 2:
                    System.out.println("======================查找房屋=====================");
                    break;
                case 3:
                    System.out.println("删 除 房 屋");
                    break;
                case 4:
                    System.out.println("修 改 房 屋 信 息");
                    break;
                case 5:
                    System.out.println("房 屋 列 表");
                    break;
                case 6:
                    System.out.println("退出");
                    break;
                default:
                    System.out.println("选择有误，请重新选择！");
            }

        } while (true);

    }
}
