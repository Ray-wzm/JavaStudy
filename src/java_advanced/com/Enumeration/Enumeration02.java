/**
 * @author: 一只羊驼
 * @date: 2024/2/5
 */

package java_advanced.com.Enumeration;

public class Enumeration02 {
    public static void main(String args[]) {
        //2. 使用关键字 enum，默认会继承Enum类，并且是个final的，说明不能再继承其他类了，但是可以实现接口
        /**
         * final class java_advanced.com.Enumeration.Season2 extends java.lang.Enum<java_advanced.com.Enumeration.Season2> {
         *   public static final java_advanced.com.Enumeration.Season2 SPRING;
         *   public static final java_advanced.com.Enumeration.Season2 SUMMER;
         *   public static final java_advanced.com.Enumeration.Season2 AUTUMN;
         *   public static final java_advanced.com.Enumeration.Season2 WINTER;
         *   public static java_advanced.com.Enumeration.Season2[] values();
         *   public static java_advanced.com.Enumeration.Season2 valueOf(java.lang.String);
         *   public java.lang.String getName();
         *   public java.lang.String getDesc();
         */
        System.out.println(Season2.SPRING);
    }
}

/**
 * 演示定义枚举实现
 */
enum Season2 {



    //1. 私有化构造器，目的是防止直接被New
    //2. 去掉set相关方法，防止属性被修改
    //3. 在season类内部，创建固定对象
    //4. 可以加入final修饰符，防止类被加载
    //定义了 4 个对象
//    public static final Season SPRING = new Season2("春天", "温暖");
//    public static final Season WINTER = new Season("冬天", "寒冷");
//    public static final Season SUMMER = new Season("夏天", "炎热");
//    public static final Season AUTUMN = new Season("秋天", "凉爽");

    //如果使用了enum关键字实现枚举类
    //1. 使用关键字enum替代class
    //2. 常量名（实参列表），如果使用无参构造器，则（实参列表）可以省略
    //3. 如果有多个，用逗号分隔即可
    //4. 如果使用enum实现枚举，需要把定义的常量对象，写在最前面
    SPRING("春天", "温暖"),SUMMER("夏天", "炎热"), AUTUMN("秋天", "凉爽"),WINTER("冬天", "寒冷");
    private String name;
    private String desc;
    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

