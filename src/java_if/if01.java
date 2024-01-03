/**
 * @author 一只羊陀
 * @date 2024/1/3
 */
package java_if;
import java.util.Scanner;

public class if01 {
    public static void main (String args[]){
        //编写一个程序，可以输入人的年龄，如果该同志年龄大于18，则输出“你的年龄大于18，要对自己的行为负责，否则送入监狱”
        Scanner myscanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = myscanner.nextInt();
        if(age>18){
            System.out.println("你的年龄大于18，要对自己的行为负责，否则送入监狱");
        }
        else{
            System.out.println("程序继续...");
        }
    }
}
