/**
 * @author: 一只羊驼
 * @date: 2024/1/18
 */

package java_intermediate.com.yzyt;
//package必须放在class上面，且一个类中只能有一句 package

import java.util.Arrays;

//import java.util.Scanner; //表示只引入，java.util 包下面的 Scanner 类；（最好是要用什么，导入什么）
// import java.util.* 表示把包里面的所有类都引入（不建议使用）
//import 的主要目的就是使用包下面的类
public class import01 {
    public static void main(String args[]) throws InterruptedException {
        // 开始时间
        long stime = System.nanoTime();
        // 执行时间（1s）
        Thread.sleep(1000);
        // 结束时间
        long etime = System.nanoTime();


        int[] arr = {-1, 30, 2, 4, 23};
        int[] arr1 = {-1, 30, 2, 4, 23};
        //传统排序方式，自己写冒泡方法
        int index = -1;//用于判断是否进入交换，优化排序速度
        //纵向看，5个数，需要进行 4 次排序，也就是执行 arr.length-1 次
        for (int i = 0; i < arr.length - 1; i++) {
            //横向看，5个数，把最大的放到右边，需要四次排序，也是执行 arr.length-1 次
            for (int j = 0; j < arr.length - 1; j++) {
                int temp;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    index = 0; //如果数组非有序，那么就进入排序交换，就置0
                }
            }
            if (index == -1) {
                return; //如果到某一趟以后，数组已经是有序的了，index就是 -1，就提前跳出本次循环
            }
        }

        // 计算执行时间
        System.out.printf("手动排序执行时长：%d 毫秒.", (etime - stime));
        System.out.println();
        //打印排序结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //使用系统提供的Arrays类完成数组排序
        Arrays.sort(arr1);

        // 计算执行时间
        System.out.printf("数组类排序执行时长：%d 毫秒.", (etime - stime));
        System.out.println();

        //打印排序结果
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}

