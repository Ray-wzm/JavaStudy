/**
 * @author: 一只羊驼
 * @date: 2024/1/30
 */

package java_project.HouseRental.Service;

import java_project.HouseRental.model.House;

import java.util.Scanner;

public class HouseService {
    private House[] houses;//用来存放House对象
    private int HouseNums = 1;//记录当前有多少房屋信息
    private int idCounter = 1;//记录当前的ID增长到哪个值
    private int choiceId;//用户选择的Id
    Scanner scanner = new Scanner(System.in);

    public HouseService(int size) {
        houses = new House[size];//当创建HouseService对象时，指定数组大小
        //测试，初始化一个对象
        houses[0] = new House(1, "jack", "112", "天津市", 1000, "未出租");
    }

    //list方法，返回houses
    public House[] list() {
        return houses;
    }

    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse) {
        //判断是否可以继续添加？
        if (HouseNums == houses.length) {
            System.out.println("数组已满，不能添加");
            return false;
        }
        houses[HouseNums++] = newHouse;
        //设计ID自增长机制
//        idCounter++;
//        newHouse.setId(idCounter);
        newHouse.setId(++idCounter);
        return true;
    }

    //del方法，按照Id删除对象，并返回boolean
    public boolean del(int choose) {
        int index = -1;
        for (int i = 0; i < HouseNums; i++) {
            if (choose == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        for (int i = index; i < HouseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--HouseNums] = null;//将当前数组的最后一个置空
        return true;
    }

    //search方法
    public House search(int choiceId){
        for(int i=0;i<HouseNums;i++){
            if(choiceId==houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
}
