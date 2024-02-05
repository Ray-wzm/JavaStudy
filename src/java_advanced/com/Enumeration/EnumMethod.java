/**
 * @author: 一只羊驼
 * @date: 2024/2/5
 */

package java_advanced.com.Enumeration;

public class EnumMethod {
    public static void main(String args[]) {
        Season2 autumn = Season2.AUTUMN;
        System.out.println(autumn.name());//输出枚举对象的名称
        System.out.println(autumn.ordinal());//输出该枚举对象的次序/编号，从 0 开始编号；AUTUMN是第三个，所以输出2
        //从反编译可以看出values返回Season2[]，含有定义的所有Season对象
        Season2[] values = Season2.values();
        for(Season2 season:values){ //增强for,依次从values数组中取出数据给Season，如果没有了就退出
            System.out.println(season);
        }
        //valueOf:将字符串转换成枚举对象，要求字符串必须为已有常量名，否则报异常
        System.out.println("autumn1="+Season2.valueOf("AUTUMN"));//相当于通过枚举常量的名称NAME去匹配，如果有，就输出，究极检索的概念
        System.out.println(Season2.SPRING.compareTo(Season2.AUTUMN));//compareTo:比较两个枚举常量的位置号，相当于两个编号相减
    }
}
