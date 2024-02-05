/**
 * @author: 一只羊驼
 * @date: 2024/2/5
 */

package java_advanced.com.Enumeration;

public class EnumWork {
    public static void main(String args[]) {
        System.out.println("===所有星期信息打印如下===");
        week[] values=week.values();
        for(week week:values){
            System.out.println(week);
        }
    }
}

enum week{
    /*
    * 枚举周一到周日
    * */
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),
    THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),
    SUNDAY("星期日");

    private String name;

    private week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}