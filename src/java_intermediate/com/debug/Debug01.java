/**
 * @author: 一只羊驼
 * @date: 2024/1/26
 */

package java_intermediate.com.debug;

public class Debug01 {
    //演示逐行执行代码 F8 逐行执行代码
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("i=" + i);
            sum += i;
            System.out.println("sum=" + sum);
        }
        System.out.println("退出for..");
    }
}
