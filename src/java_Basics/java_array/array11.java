/**
 * @author 一只羊驼
 * @date 2024/1/7
 */

package java_Basics.java_array;

public class array11 {
    public static void main(String args[]) {
        /**
         *  动态创建二维数组并输出：
         *         i=0:1
         *         i=1:2 2
         *         i=2:3 3 3
         */
        int[][] arr = new int[3][];
        for (int i = 0; i < arr.length; i++) {//遍历每一个一维数组
            //给每一个一维数组开辟空间
            arr[i] = new int[i + 1];
            //遍历数组，并给一维数组的每个元素赋值
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
