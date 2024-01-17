/**
 * @author: 一只羊驼
 * @date: 2024/1/12
 */

package java_Basics.java_recursion;

public class eightQueen {
    public static void main(String args[]) {
        /*
        在 8×8 格的国际象棋上摆放八个皇后，使其不能互相攻击，
        即：任意两个皇后都不能处于同一行、同一列或同一斜线上，问有多少种摆法。
         */
        Queen queen = new Queen();
        queen.chess(0);
    }
}

/*
 *  思路分析：
 *   1. 先把①皇后放第 1 行 第 1 列；
 *   2. 第②个皇后放第 2 行 第 1 列，看是否符合规则，不符合就放第 2 行 第 2 列，符合就退出，不符合就继续向右；
 *   3. 继续第③~⑧皇后，直到所有皇后都在棋盘上，就算是一个解。
 *      然后回溯到第②个皇后处，继续测试，直到①皇后的所有解全部测出，回退到①皇后处；
 *   4. 把①皇后放第 1 行 第 2 列，循环前面四步；
 */

class Queen {
    // 由于一行一次只有一个皇后，用 1 维数组表示皇后
    // 如：chessBord[0] = 1,表示第1行第2列是一个皇后
    // 创建棋盘
    int MAX = 8;
    int[] chessBoard = new int[MAX];
    //记录解的个数
    int count = 0;

    public void chess(int i) {
        // i 为行，j 为列
        //如果i等于8，表示每一行都测试过了，输出一个解，并退出
        if (i == MAX) {
            print();
            count++;
            return;
        }
        //从第一列开始测试
        for (int j = 0; j < MAX; j++) {
            //在该行的第j列放一个皇后
            chessBoard[i] = j;
            //判断是否冲突
            //如果不冲突，说明放置没有问题，就测试下一行
            if (judge(i)) {
                chess(i + 1);
            }
            //冲突则不用操作，继续进行下一列测试，直到不冲突
        }
    }

    //打印放好解的棋盘
    public void print() {
        System.out.print("第" + (count + 1) + "个解：");
        for (int i = 0; i < chessBoard.length; i++) {
            System.out.print(chessBoard[i] + " ");
        }
        System.out.println();
    }

    //判断落子位置是否符合要求
    public boolean judge(int n) {
        //任意两个皇后都不能处于同一行、同一列或同一斜线上
        /*
         *  . x . . c[0]=1
         *  . . x . c[1]=2
         */
        for (int i = 0; i < n; i++) {
            if (chessBoard[n] == chessBoard[i] || Math.abs(n - i) == Math.abs(chessBoard[n] - chessBoard[i])) {
                return false;
            }
        }
        return true;
    }
}