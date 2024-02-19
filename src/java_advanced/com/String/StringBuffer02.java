/**
 * @author: 一只羊驼
 * @date: 2024/2/19
 */

package java_advanced.com.String;

public class StringBuffer02 {
    public static void main(String args[]) {
        //构造器的使用
        //1. 创建一个大小为16的Char[]
        StringBuffer stringBuffer = new StringBuffer();
        //2. 通过构造器指定char[]的大小
        StringBuffer stringBuffer1 = new StringBuffer(100);
        //3. 通过给一个String创建StringBuffer
        //  创建一个大小为16+str.length 的Char[]，然后将字符串拼接进来
        StringBuffer ray = new StringBuffer("Ray");
        //4. String --> StringBuffer
        String str = "hello Tom";
        //方式一 使用构造器
        //返回的才是StringBuffer对象，对str本身没有影响
        StringBuffer stringBuffer2 = new StringBuffer(str);
        //方式二 使用append
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3 = stringBuffer3.append(str);
        //5. StringBuffer --> String
        StringBuffer stringBuffer4 = new StringBuffer("一只羊驼");
        //方式一 直接用 toString方法
        String s = stringBuffer4.toString();
        //方式二 使用构造器
        String string = new String(stringBuffer4);

    }
}
