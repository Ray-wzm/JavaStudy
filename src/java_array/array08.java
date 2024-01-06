/**
 * @author 一只羊驼
 * @date 2024/1/6
 */

package java_array;

public class array08 {
    public static void main(String args[]) {
        //冒泡排序
        //从小到大[24,69,80,57,13]
        //[24,69,80,57,13]
        //[24,69,80,57,13]
        //[24,69,57,80,13]
        //[24,69,57,13,80]
        int[] arr = {24, 69, 80, 57, 13,200,-1,40,29};
        //5个数需要4次交换
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1 - i; j++) {
                int temp = 0;
                //如果前面的数大于后面的数，就交换
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}
