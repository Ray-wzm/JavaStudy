/**
 * @author 一只羊驼
 * @date 2024/1/6
 */

package java_Basics.java_array;

import java.util.Scanner;

public class array02 {
    public static void main(String args[]) {
        //1. 数组动态初始化的时候就去分配空间
        //double[] nums=new double[5];
        double[] nums;//2. 先声明一个数组（此时没有内存空间，直接引用会报错）
        nums = new double[5];//再分配内存
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextDouble();
            System.out.printf("第" + (i + 1) + "个数是：" + nums[i] + "\n");
        }
    }
}
