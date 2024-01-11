/**
 * @author: 一只羊驼
 * @date: 2024/1/11
 */

package java_recursion;

public class migong {
    public static void main(String args[]) {
        //1. 先创建迷宫，用二维数组表示 假定为 8行 7列
        int[][] map = new int[8][7];
        //2. 约定，0标识可以走，1标识障碍物
        //3. 设置障碍物，将上下两行设置为障碍
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;//第一行
            map[7][i] = 1;//最后一行
        }
        //4. 设置障碍物，将左右两列设置为障碍
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        //5. 随便再单独配几个障碍物
        map[3][1] = 1;
        map[3][2] = 1;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.printf(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("找路后");
        M m1=new M();
        m1.findWay(map,1,1);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.printf(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// 1.findWay方法就是专内来找出迷宫的路径
// 2.如果找到了就返回 true ，否则返回false
// 3.map 就是二维数组，即表示迷宫
// 4.i,j 就是老鼠的位置，初始化的位置为(1,1)
// 5.因为我们是递归的找路，所以我先规定 map数组的各个值的含义
//   0 表示可以走 1 表示障碍物 2 表示找到通路  3 表示走过，但是走不通是死路
// 6.当map[6][5] =2 就说明找到通路，就可以结束，否则就继续找，
// 7.先确定老鼠找路策略 下->右->上->左
class M {
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                //假定确实是通路
                map[i][j] = 2;
                //确定是否可以走通
                if (findWay(map, i, j + 1)) { //下
                    return true;
                } else if (findWay(map, i + 1, j)) { //右
                    return true;
                } else if (findWay(map, i, j - 1)) { //上
                    return true;
                } else if (findWay(map, i - 1, j)) { //左
                    return true;
                } else {
                    //上面四个方向都判断过还不行，说明假定不成立，将原来的假定置为 3 走过但是走不通
                    map[i][j] = 3;
                    return false;
                }
            } else {
                // 1 2 3
                return false;
            }
        }
    }
}