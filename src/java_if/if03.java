/**
 * @author 一只羊驼
 * @date 2024/1/3
 */
package java_if;
import java.util.Scanner;

public class if03 {
    public static void main(String args[]) {
        //定义两个变量int，判断两者的和，是否能被3又能被5整除，打印提示信息
        Scanner myScanner1 = new Scanner(System.in);
        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("请输入2个数:");
        int num1 = myScanner1.nextInt();
        int num2 = myScanner2.nextInt();
        System.out.println("num1="+num1+",num2="+num2);
        if((num1+num2)%3==0 && (num1+num2)%5==0){
            System.out.println((num1+num2)+"能被3和5整除！");
        }else{
            System.out.println("num1="+num1+",num2="+num2);
        }
    }
}
