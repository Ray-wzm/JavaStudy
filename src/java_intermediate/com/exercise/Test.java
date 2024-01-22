/**
 * @author: 一只羊驼
 * @date: 2024/1/22
 */

package java_intermediate.com.exercise;

/**
 * 案例3
 * 1. 编写Computer类，包含CPU、内存、硬盘等属性，getDetails方法用于返回Computer的详细信息
 * 2. 编写PC子类，继承Computer类，添加特有属性[品牌brand]
 * 3. 编写NotePad子类，继承Computer类，添加特有属性[演示color]
 * 4. 编写Test类，在main方法中创建PC和NotePad对象，分别给对象中特有的属性赋值，以及从Computer类继承的属性赋值，并使用方法并打印输出信息。
 */
public class Test {
    public static void main(String args[]) {
        NotePad notePad = new NotePad(0.6, 0.4, 0.3, "雾霾蓝");
        notePad.printInfo();
    }
}

class Computer {
    double cpu;//cpu使用率
    double memory;//内存使用率
    double card;//硬盘使用率

    public Computer() {
        System.out.println("我是Computer的无参构造器");
    }

    public Computer(double cpu, double memory, double card) {
        System.out.println("我是Computer的有参构造器");
        this.cpu = cpu;
        this.memory = memory;
        this.card = card;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getCard() {
        return card;
    }

    public void setCard(double card) {
        this.card = card;
    }

    public String getDetails() {
        return "电脑的cpu使用率为：" + getCpu() + "，内存占用率为：" + getMemory() + "，硬盘占用率为：" + getCard();
    }
}

class PC extends Computer {
    public PC(double cpu, double memory, double card, String brand) {
        super(cpu, memory, card);
        this.brand = brand;
    }

    String brand;

    public void printInfo() {
        System.out.println(getDetails() + "颜色是：" + brand);
    }
}

class NotePad extends Computer {
    String color;

    public NotePad(double cpu, double memory, double card, String color) {
        super(cpu, memory, card);
        this.color = color;
    }

    public void printInfo() {
        System.out.println(getDetails() + ",颜色是：" + color);
    }
}
