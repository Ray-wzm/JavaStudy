/**
 * @author: 一只羊驼
 * @date: 2024/2/6
 */

package java_advanced.com.Exception;

public class exception03 {
    public static void main(String args[]) /*throws AgeException*/{
        int age = 180;
        if (!(age >= 18 && age <= 100)) {
            throw new AgeException("年龄需要在 18~100之间");
        }
        System.out.println("年龄正确");
        //throws 后面跟的是具体的异常名称，throw是手动生成异常对象的关键字
    }
}



//一般情况下，自定义异常都是集成RuntimeException,也就是把自定义异常做成运行时异常，也就是可以使用默认的异常处理机制
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}