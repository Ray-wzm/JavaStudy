/**
 * @author: 一只羊驼
 * @date: 2024/1/26
 */

package java_intermediate.com.debug;

import java.util.Arrays;

public class Debug03 {
    public static void main(String args[]) {
        int[] arr = {1, -1, -10, 20, -100}; //F7进到源码方法
        Arrays.sort(arr); //shift+ F8退出进入
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("111");//F9进入下一个断点，支持debug临时动态加断点
    }
}
