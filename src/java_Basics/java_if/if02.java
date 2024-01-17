/**
 * @author 一只羊陀
 * @date 2024/1/3
 */
package java_Basics.java_if;
import java.util.Scanner;

public class if02 {
    public static void main(String args[]){
        //声明2个double变量并赋值，判断第一个数大于10.0，且第二个数小于20.0，打印两数之和
        //double num1,num2;
        Scanner myScanner1 = new Scanner(System.in);
        Scanner myScanner2= new Scanner(System.in);
        System.out.println("请输入两个小数：");
        double num1 = myScanner1.nextDouble();
        double num2 = myScanner2.nextDouble();
        if(num1>10.0 && num2<20.0 ){
            System.out.println(num1+num2);
        }
        else{
            System.out.println("num1=" + num1 + "，num2=" + num2);
        }
    }
}
