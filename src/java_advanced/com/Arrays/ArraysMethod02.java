/**
 * @author: 一只羊驼
 * @date: 2024/2/21
 */

package java_advanced.com.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod02 {
    public static void main(String args[]) {
        int[] arr = {-1, 6, 2, -8, 10};
        System.out.println("====Origin====");
        System.out.println(Arrays.toString(arr));
        bubble01(arr);
        System.out.println("====Sort====");
        System.out.println(Arrays.toString(arr));
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println("====Sort2====");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble01(int[] arr) {
        int index = -1;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    index = 0;
                }
            }
            if (index == -1) {
                return;
            }
        }
    }

    //结合冒泡加定制
    public static void bubble02(int[] arr, Comparator c) {
        int index = -1;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    index = 0;
                }
            }
            if (index == -1) {
                return;
            }
        }
    }
}
