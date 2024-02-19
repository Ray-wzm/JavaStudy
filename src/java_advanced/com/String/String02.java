/**
 * @author: 一只羊驼
 * @date: 2024/2/7
 */

package java_advanced.com.String;

public class String02 {
    public static void main(String args[]) {
        //创建String对象有两种方式
        //1. 直接赋值
        //2. 调用构造器
        Test1 ex = new Test1();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+"and");
        System.out.println(ex.ch);
    }
}

class Test1{
    String str = new String("hsp");
    final char[] ch = {'j','a','v','a'};
    public void change(String str,char ch[]){
        str="java";
        ch[0]='h';
    }
}