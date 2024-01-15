/**
 * @author 一只羊驼
 * @date 2024/1/15
 */

package java_obejct;


public class work11 {
    public static void main(String args[]) {
        PersonT t1 = new PersonT();
        t1.Challenge(5);
    }
}

// 有个人 Tom
// 设计他的成员变量.成员方法,
// 可以电脑猜拳电脑每次都会随机生成 0,1,2
// 0 表示 石头 1 表示剪刀 2 表示布
// 并要可以显示 Tom的输赢次数 (清单)

class PersonT {
    String name = "小明";//人名
    int action;//出拳动作
    int win = 0;

    //(int)(Math.random()*10%3) 0-2的随机数
    //电脑，随机0-2的正数，并判断输赢，并列举
    public void Challenge(int round) {
        int computer_action;
        for (int i = 1; i <= round; i++) {
            action = (int) (Math.random() * 10 % 3);
            computer_action = (int) (Math.random() * 10 % 3);
            if (action == computer_action) {
                System.out.println(this.name + "出" + this.action + ", 电脑出" + computer_action + ", 平局！");
            } else if (action == 0 && computer_action == 1) {
                System.out.println(this.name + "出" + this.action + ", 电脑出" + computer_action + ", 小明赢！");
                win++;
            } else if (action == 0 && computer_action == 2) {
                System.out.println(this.name + "出" + this.action + ", 电脑出" + computer_action + ", 电脑赢！");
            } else {
                System.out.println(this.name + "出" + this.action + ", 电脑出" + computer_action + ", 小明赢！");
                win++;
            }
        }
        System.out.println(this.name + "赢了" + win + "次，输了" + (round - win) + "次");
    }

}