/**
 * @author 一只羊驼
 * @date 2024/1/7
 */

package java_array;

public class array13 {
    public static void main(String args[]) {
        //打印杨辉三角
        /**
         * 1
         * 1 1
         * 1 2 1
         * 1 3 3 1
         * 1 4 6 4 1
         * 1. 第一行 1 个元素，第 n 行 n 个元素
         * 2. 每一行首尾都是 1
         * 3. 从第三行开始，非首尾值，arr[i][j]=arr[i-1][j]+arr[i-1][j-1]
         */
        int[][] yangHui = new int[10][];
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
            for (int j = 0; j < yangHui[i].length; j++) {
                if (j == 0 || j == yangHui[i].length-1) {
                    yangHui[i][j] = 1;
                } else {
                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
                }
                System.out.print(yangHui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
