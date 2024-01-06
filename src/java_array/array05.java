/**
 * @author 一只羊驼
 * @date 2024/1/6
 */

package java_array;

public class array05 {
    public static void main(String args[]) {
        //数组反转 array{11,22,33,44,55,66}-->{66,55,44,33,22,11}
        int[] array1 = {11, 22, 33, 44, 55, 66};
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[array1.length - 1 - i];
            System.out.printf(array1[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.printf(array2[i] + "  ");
        }
        //首尾值依次交换的方式
        for (int i = 0; i <= array1.length / 2; i++) {
            int temp = array1[array1.length - 1 - i];
            array1[array1.length - 1 - i] = array1[i];
            array1[i] = temp;
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.printf(array2[i] + "  ");
        }
    }
}
