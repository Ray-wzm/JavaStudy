/**
 * @author: 一只羊驼
 * @date: 2024/1/5
 */

package java_for;

import java.util.Scanner;

public class work03 {
    public static void main(String args[]) {
//        6.输出1-100之间的不能被5整除的数，每5个一行
        int i = 1;
        int count = 0;
        while (i <= 100) {
            if (i % 5 == 0) {
                System.out.printf(i + " ");
                count += 1;
                if (count == 5) {
                    System.out.println();
                    count = 0;
                }
            }
            i++;
        }
        // 7.输出小写的a-z以及大写的Z-A
        char letter1 = 'a';
        char letter2 = 'Z';
        //(int)(字符串）就相当于获取他的ASCII码
        for (int n = (int) (letter1); n < (int) (letter1) + 26; n++) {
            System.out.print((char) (n));
        }
        System.out.println();
        for (int n = (int) (letter2); n > (int) (letter2) - 26; n--) {
            System.out.print((char) (n));
        }
        System.out.println();
//        8.求出1-1/2+1/3-1/4.....1/100的和
        double sum = 0;
        //注意分母是double，分子也有是一个数据类型，不然会被强制int转换
        for (int m = 1; m <= 100; m++) {
            if (m % 2 == 0) {
                sum -= 1.0 / m;
            } else {
                sum += 1.0 / m;
            }
        }
        System.out.println(sum);

//        9.求1+ (1+2) + (1+2+3) + (1+2+3+4) +...+(1+2+3+..+100)的结果
       int sum1=0;
        for(int q=1;q<=100;q++){
            for(int w=1;w<=q;w++){
                sum1+=w;
            }
        }
        System.out.println(sum1);
    }
}
