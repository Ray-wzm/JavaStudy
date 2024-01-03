/**
 * @author 一只羊驼
 * @date 2024/1/3
 */

package java_if;

import java.util.Scanner;

public class if07 {
    public static void main(String args[]) {
        //出票系统：（旺季4-10）成人（18-60）：60；儿童（<18）半价；老人（>60）1/3；（淡季）成人40；其他20
        System.out.println("请输入月份和年龄");
        Scanner scanner1=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        int month = scanner1.nextInt();
        int age = scanner2.nextInt();
        if(month>=4&&month<=10){
            if(age>=18&&age<=60){
                System.out.println("现在是旺季！您的年龄是"+age+"属于成人！票价为60");
            }
            else if(age < 18){
                System.out.println("现在是旺季！您的年龄是"+age+"属于未成年！票价为30");
            }
            else if(age > 60){
                System.out.println("现在是旺季！您的年龄是"+age+"属于老年！票价为20");
            }
            else{
                System.out.println("年龄输入有误，请重新输入！");
            }
        }
        else{
            if(age>=18&&age<=60){
                System.out.println("现在是淡季！您的年龄是"+age+"属于成人！票价为40");
            }
            else{
                System.out.println("现在是淡季！您的年龄是"+age+"不属于成人！票价为20");
            }
        }
    }
}
