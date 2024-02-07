/**
 * @author: 一只羊驼
 * @date: 2024/2/7
 */

package java_advanced.com.String;

public class string01 {
    public static void main(String args[]) {
        //String 实现了 Serializable ，说明 String 对象可以串行化，也就是可以在网络中传输
        //String 实现了 Comparable ， 说明 String 对象可以相互比较
        //String对象用于保存字符串，也就是一组字符序列
        //字符串的字符使用Unicode字符编码，一个字符（不区分字母还是汉字）占两个字节
        //String类有很多构造器，构造器的重载

        String name = "Ray";
        //字符串常量，是用双引号引起来的，等号前面的，是变量
        //String是Final类，不能被其他类继承
        //String 有属性 private final char value[]; 用来存放字符串内容
        //并且 value 是 final 类型，地址不可以修改；单个字符的内容是可以变化的
        final char[] value = {'a','b','c'};
        char[] v2 = {'a','b','c'};
        value[0]='A';
        //value=v2; final 限制了value的地址不能被更改

    }
}
