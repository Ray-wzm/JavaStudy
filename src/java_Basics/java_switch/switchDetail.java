/**
 * @author 一只羊驼
 * @date 2024/1/3
 */

package java_Basics.java_switch;

public class switchDetail {
    public static void main(String args[]) {
        //表达式数据类型，应该和case后的常量类型一致
        //或者是可以自动转换成可以相互比较的类型，比如输入的是字符，而常量是int
        //switch(表达式)中的返回值必须是（byte\short\int\char\enum\String）
        //case语句中的值必须是常量或者常量表达式，有具体值，不能为变量
        char c = 'a';
        switch (c) {
            case 'a':
                System.out.println("ok1");
                break;
            case 2:
                System.out.println("ok2");
                break;
            default:
                System.out.println("ok3");
        }
    }
}
