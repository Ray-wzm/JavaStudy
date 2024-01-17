/**
 * @author 一只羊驼
 * @date 2024/1/6
 */

package java_Basics.java_array;

public class array03 {
    public static void main(String args[]) {
        //创建一个char类型26个元素的数组，分别放置 A-Z，使用for打印出来
        char[] letter = new char[26];
        for (int i = 0; i < letter.length; i++) {
            letter[i] = (char) ((int) ('A') + i);
            System.out.print(letter[i] + " ");
        }
        System.out.println();
        //请求出一个数组int[]的最大值{4，-1，9，10，23},并得到对应的下标
        int[] nums = new int[]{4, -1, 9, 10, 23};
        int max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        System.out.print("最大值是" + max + "，下标为：" + index);
        //1. 基本数据类型的赋值机制：值拷贝；n2的改变不影响n1
        int n1 = 10;
        int n2 = n1;
        n2 = 80;
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        //2. 数组的赋值机制：默认情况下是引用传递，赋的值是地址
        //arr2的变换会影响到arr1
        int[] arr1={1,2,3};
        int[] arr2=arr1;
        arr2[0]=0;
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]);
        }
    }
}
