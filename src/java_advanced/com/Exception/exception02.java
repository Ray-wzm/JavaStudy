/**
 * @author: 一只羊驼
 * @date: 2024/2/6
 */

package java_advanced.com.Exception;

import java.util.Scanner;

public class exception02 {
    public static void main(String args[]) {
        //Exception：编译异常和运行异常
        //编译异常是在JAVAC编译阶段会出现的异常，运行异常是，编译成功，在运行阶段出现的异常
        //运行异常是编译器检查不出来的，一般是编程的逻辑错误
        //编译异常必须处理，运行异常可以按需处理，这类异常比较普遍，全部处理可能会对程序可读性和效率产生影响
//      1) 空指针异常 NullPointerException: 当程序试图在需要对象的地方使用null
//      2) 数学运算异常 ArithmeticException: 出现异常的运算条件时，抛出此异常
//      3) 数组越界异常 ArrayIndexOutOfBoundsException
//      4) 类型转换异常 ClassCastException: 试图将对象强制转换为不是实例的子类时，抛出该异常
//       [异常处理]方式
//       1) try-catch-finally 程序员在代码中捕获发生的异常，catch里需要自行处理，不管是不是执行了try，finally都要被执行（通常用于某些重要资源的释放和关闭）
//          如果发生了异常，那么异常后面的代码不会执行
//          有多个异常可以写多个catch，要求子类异常写前面，父类异常写后面
//       2) throws 将发生的异常抛出，交给调用者处理，最顶级的处理者是JVM
        Scanner scanner = new Scanner(System.in);
        int num =0 ;
        String inputstr="";
        while (true) {

            System.out.println("请输入一个整数：");
            inputstr=scanner.next();
            try {
                num=Integer.parseInt(inputstr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入不是整数！");
                e.printStackTrace();
            }

        }

    }
}
