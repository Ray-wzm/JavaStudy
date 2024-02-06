/**
 * @author: 一只羊驼
 * @date: 2024/2/6
 */

package java_advanced.com.Exception;

public class exception01 {
    public static void main(String args[]) {
        //如果认为某一段代码有问题，可以使用try-catch机制来解决，从而保证非致命错误不影响程序执行
        int num1 = 1;
        int num2 = 0;
        //选中认为有问题的代码块，CTRL+ALT+T，选中 try-catch
        //如果进行了异常处理，即使出现了异常，程序也会继续执行
        /**
         * 程序执行过程中发生的不正常状况称为异常；开发过程中的语法或者逻辑错误不是异常
         * 异常可以分为两大类：
         * 1. ERROR（错误）：JVM无法解决的严重问题，比如StarkOverFlow栈溢出等
         * 2. Exception：其他因编程错误或偶然的外在因素导致的一般性问题，可以使用针对性代码处理
         *      比如空指针访问，试图读取不存在的文件，网络链接中断等等
         *      分为两大类：运行时异常[]和编译时异常[];
         */
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序继续执行");
    }
}
