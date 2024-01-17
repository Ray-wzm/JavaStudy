/**
 * @author 一只羊驼
 * @date 2024/1/7
 */

package java_Basics.java_array;

public class array10 {
    public static void main(String args[]) {
        //二维数组
        //int[][] array = new int[2][3];
        //2代表这个二维数组里面包含两个1维数组，3代表每个1维数组里面包含三个数据
        int[][] array = {{0, 0, 0}, {1, 1, 1}, {2, 2, 2}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
