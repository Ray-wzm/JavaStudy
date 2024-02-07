/**
 * @author: 一只羊驼
 * @date: 2024/2/7
 */

package java_advanced.com.Wrapper;

public class wrapper01 {
    public static void main(String args[]) {
        //包装类相当于对基本数据类型的扩展，包装类可以和基本数据类型互相转换
        //装箱：基本数据类型--》包装类，JDK5以后可以自动装箱，底层调用的valueOf
        //拆箱：包装类--》基本数据类型
        //手动装箱
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
        int i = integer.intValue();

        //JDK5以后可以自动装箱拆箱
        int n2=100;
        Integer integer2 = n2; //底层使用的依然是 Integer.valueOf(n2)
        int n3=integer2;
    }
}
