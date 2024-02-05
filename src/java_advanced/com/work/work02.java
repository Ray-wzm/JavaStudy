/**
 * @author: 一只羊驼
 * @date: 2024/2/5
 */

package java_advanced.com.work;

public class work02 {
    public static void main(String args[]) {
        System.out.println("当前序列号：" + Frock.getCurrentNum());
        System.out.println("当前序列号：" + Frock.getNextNum());
        System.out.println("当前序列号：" + Frock.getNextNum());
        Frock[] frocks = new Frock[3];
        frocks[0] = new Frock();
        frocks[1] = new Frock();
        frocks[2] = new Frock();
        for (Frock frock : frocks) {
            System.out.println(frock);
        }
    }
}

/**
 * (1)在Frock类中声明私有的静态属性currentNum[int类型]，初始值为100000，作为衣服出厂的序列号起始值。
 * (2)声明公有的静态方法getNextNum，作为生成上衣唯一序列号的方法。每调用一次，将currentNum增加100，并作为返回值。
 * (3)在TestFrock类的main方法中，分两次调用getNextNum方法，获取序列号并打印输出
 * (4)在Frock类中声明serialNumber(序列号)属性，并提供对应的get方法;
 * (5)在Frock类的构造器中，通过调用getNextNum方法为Frock对象获取唯一序列号，赋给serialNumber属性
 * (6)在TestFrock类的main方法中，分别创建三个Frock 对象，并打印三个对象的序列号，验证是否为按100递增。
 */

class Frock {
    private static int currentNum = 100000;//衣服出场序列号起始值
    private int serialNumber;//序列号

    public Frock() {
        this.serialNumber = Frock.getNextNum();
    }

    public static int getCurrentNum() {
        return currentNum;
    }



    public int getSerialNumber() {
        return serialNumber;
    }



    public static int getNextNum() {
        currentNum+=100;
        return currentNum;
    }

    @Override
    public String toString() {
        return "Frock{" +
                "serialNumber=" + serialNumber +
                '}';
    }
}