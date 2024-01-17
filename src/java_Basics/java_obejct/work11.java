/**
 * @author 一只羊驼
 * @date 2024/1/15
 */

package java_Basics.java_obejct;


import java.util.Random;
import java.util.Scanner;

public class work11 {
    public static void main(String args[]) {
        PersonT t1 = new PersonT();
        int round;
        Scanner scanner = new Scanner(System.in);
        System.out.println("要玩几局？");
        round = scanner.nextInt();
        int[][] arr1 = new int[round][round];//创建一个二维数组，用来接收局数，用户出拳情况和电脑出拳情况
        int j = 0;
        int win = 0;
        String[] arr2 = new String[round]; //创建一个一维数组，接收输赢情况

        for (int i = 0; i < round; i++) {
            System.out.println("请输入你要出的拳：（0-石头，1-剪刀，2-布）");
            int num = scanner.nextInt();
            t1.setUser_Gess(num);
            int User_Gess = t1.getUser_action();
            arr1[i][j + 1] = User_Gess;
            //获取电脑出拳
            int ComputerGuess = t1.setComputer_Gess();
            arr1[i][j + 2] = ComputerGuess;
            String isWin = t1.Challenge();
            arr2[i] = isWin;
            arr1[i][j] = t1.count;
            System.out.println("=================================");
            System.out.println("局数\t玩家出拳\t电脑出拳\t输赢情况");
            System.out.println(t1.count + "\t\t\t" + User_Gess + "\t\t\t" + ComputerGuess + "\t\t\t" + isWin);
            System.out.println("=================================");
            win = t1.winCount(isWin);
        }

        System.out.println("局数\t玩家出拳\t电脑出拳\t输赢情况");
        for (int a = 0; a < arr1.length; a++) {
            for (int b = 0; b < arr1[a].length; b++) {
                System.out.print(arr1[a][b] + "\t\t");
            }
            System.out.print(arr2[a]);
            System.out.println();
        }
        System.out.println("你赢了" + win + "次");


    }
}

// 有个人 Tom
// 设计他的成员变量.成员方法,
// 可以电脑猜拳电脑每次都会随机生成 0,1,2
// 0 表示 石头 1 表示剪刀 2 表示布
// 并要可以显示 Tom的输赢次数 (清单)

class PersonT {
    String name = "小明";//人名
    int user_action;//出拳动作
    int computer_action;//电脑出拳动作
    int wincount;
    int count = 1;

    /**
     * 设置电脑出拳方法
     *
     * @computer_Gess
     */
    public int setComputer_Gess() {
        Random r = new Random();
        computer_action = r.nextInt(3);
        return computer_action;
    }

    /**
     * 设置用户出拳方法
     *
     * @param user_action
     * @setUser_Gess
     */
    public void setUser_Gess(int user_action) {
        if (user_action > 2 || user_action < 0) {
            //抛出数据错误异常
            throw new IllegalArgumentException("数据错误！");
        }
        this.user_action = user_action;
    }

    public int getUser_action() {
        return user_action;
    }


    public String Challenge() {
        if (user_action == computer_action) {
            return "平局！";
        } else if (user_action == 0 && computer_action == 1) {
            return "你赢了！";
        } else if (user_action == 2 && computer_action == 0) {
            return "你赢了！";
        } else if (user_action == 1 && computer_action == 2) {
            return "你赢了！";
        } else {
            return "你输了！";
        }

    }

    public int winCount(String s) {
        count++;
        if (s.equals("你赢了！")) {
            wincount++;
        }
        return wincount;
    }


}