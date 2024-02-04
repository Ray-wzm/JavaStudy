/**
 * @author: 一只羊驼
 * @date: 2024/2/4
 */

package java_advanced.com.Interface;

public class ExtendsVSInterface {
    public static void main(String args[]) {
        LittleMonkey wukong = new LittleMonkey("悟空");
        wukong.climbing();
        wukong.swiming();
        wukong.flying();
    }
}

//Monkey
class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println("Monkey" + name + "can climb");
    }
}

//接口

/**
 * 1. 当子类继承了父类，就自动的拥有父类的属性
 * 2. 如果子类需要扩展功能，可以通过实现接口的方式扩展
 * 3. 可以理解，实现接口，是对JAVA单继承机制的扩展
 *
 * 继承（is - a）主要解决代码的复用性和可维护性，接口(like - a)比继承更加灵活
 */
interface Fishable{
    void swiming();
}
interface Birdable{
    void flying();
}
//LittleMonkey
class LittleMonkey extends Monkey implements Fishable,Birdable{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swiming() {
        System.out.println("猴子学会了游泳");
    }

    @Override
    public void flying() {
        System.out.println("猴子学会了飞翔");
    }
}