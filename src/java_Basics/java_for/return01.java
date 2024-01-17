/**
 * @author: 一只羊驼
 * @date: 2024/1/5
 */

package java_Basics.java_for;

public class return01 {
    public static void main(String args[]) {
        for(int i=0;i<=5;i++){
            if(i==3){
                System.out.println("塞尔达");
                return;
                //return 用在方法表示跳出方法；如果用在main里，表示跳出程序
            }
            System.out.println("hello world!");
        }
        System.out.println("继续运行!");
    }
}
