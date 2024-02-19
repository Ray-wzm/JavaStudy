/**
 * @author: 一只羊驼
 * @date: 2024/2/19
 */

package java_advanced.com.String;

public class StringBuffer01 {
    public static void main(String args[]) {
        //java.lang.StringBuffer代表可变的字符序列，可以对字符串内容进行增删改，是可变长度的，是一个容器
        //1. StringBuffer的直接父类是AbstractStringBuilder
        //2. StringBuffer实现了Serializable，也就是可以串行化
        //3. 在父类 AbstractStringBuilder 中有属性char[] value，不是 final
        //  该value数组存放字符串内容，也就是存放在堆中的
        //4. StringBuffer 是一个 final 类，不能被继承
        StringBuffer stringBuffer = new StringBuffer("hello");
        //【String VS StringBuffer】
        //(1)String保存的是字符串常量，里面的值不能更改，每次 String 类的更新实际上就是更改地址，效率较低
        //(2)StringBuffer保存的是字符串变量，里面的值可以更改，每次StringBuffer的更新实际上可以直接更新内容，不用更新地址，效率较高
        //  只有空间大小不够的时候，扩容后才会有地址更新
        //  char[] value; 这个是放在堆中的，所以不用每次都创建新的对象，也就是不用每次都更新地址
    }
}
