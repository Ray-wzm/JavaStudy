/**
 * @author 一只羊驼
 * @date 2024/1/31
 */

package java_advanced.com.Static;

public class StaticMethod {
    public static void main(String args[]) {
        Student jack = new Student("Jack");
        jack.payFee(100);

        Student marry = new Student("Marry");
        marry.payFee(200);

        Student.showFee();
        //静态方法，可以通过类名或者静态对象来调用；
        //静态变量，必须用静态方法，加了static的方法，才能访问到；this是对象的引用，访问不到静态变量
    }
}

class Student {
    public String name;
    public static double totalFee = 0.0;

    public Student(String name) {
        this.name = name;
    }

    //当方法中不涉及到任何和对象相关的成员，就可以将方法设计成静态方法
    //如果希望不创建实例，也可以调用方法（即把方法当作工具来使用）

    //类方法VS普通方法
    //类方法和普通方法都是随着类的加载而加载，将结构信息存储在方法区
    //类方法中没有this参数,普通方法中有
    //类方法可以通过类名来调用，也可以通过对象名调用
    //普通方法和对象有关，需要通过对象名调用，比如对象名.方法名
    //静态方法只能访问静态成员，非静态方法，可以访问静态成员和非静态成员

    public static void payFee(double fee) {
        Student.totalFee += fee;
        //类方法中，不允许使用和对象有关的关键字
        //this.name;
    }

    //this是对象的引用
    public static void showFee() {
        System.out.println("学费总额：" + Student.totalFee);
    }

    public static double getTotalFee() {
        return totalFee;
    }
}