/**
 * @author 一只羊驼
 * @date 2024/1/11
 */

package java_Basics.java_recursion;

public class HanoiTower {
    public static void main(String args[]) {
        tower t = new tower();
        t.towerT(5,'a','b','c');
    }
}

class tower {
    public void towerT(int num, char a, char b, char c) {
        //num : 一共有多少个盘，ABC分别是三个柱子
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            //如果有多个盘，可以看作是两个，最下面的一个和上面所有的盘
            //(1)先移动上面所有的盘到B，中间借助C
            towerT(num - 1, a, c, b);
            //(2)把下面的盘移动到C
            System.out.println(a + "->" + c);
            //(3)把B的所有盘移动到C，中间借助A
            towerT(num - 1, b, a, c);
        }

    }
}