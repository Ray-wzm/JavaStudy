/**
 * @author: 一只羊驼
 * @date: 2024/1/30
 */

package java_project.HouseRental;

import java_project.HouseRental.view.HouseView;

public class HouseRentApp {
    public static void main(String args[]) {
        //创建HouseView对象，并显示主菜单，是整个程序的入口
        new HouseView().printMenu();
        System.out.println("程序退出");
    }
}
