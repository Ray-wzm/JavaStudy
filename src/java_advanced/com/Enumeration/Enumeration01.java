/**
 * @author: 一只羊驼
 * @date: 2024/2/5
 */

package java_advanced.com.Enumeration;

public class Enumeration01 {
    public static void main(String args[]) {
        //枚举是一组常量集合，是特殊的类，里面只包含一组有限、特定的对象
        //1. 自定义枚举
        System.out.println(Season.AUTUMN.toString());
    }
}

/**
 * 演示定义枚举实现
 */
class Season {
    private String name;
    private String desc;

    //1. 私有化构造器，目的是防止直接被New
    //2. 去掉set相关方法，防止属性被修改
    //3. 在season类内部，创建固定对象
    //4. 可以加入final修饰符，防止类被加载
    //定义了 4 个对象
    public static final Season SPRING = new Season("春天", "温暖");
    public static final Season WINTER = new Season("冬天", "寒冷");
    public static final Season SUMMER = new Season("夏天", "炎热");
    public static final Season AUTUMN = new Season("秋天", "凉爽");

    private Season(String name, String desc) {
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

