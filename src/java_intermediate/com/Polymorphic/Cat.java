/**
 * @author: 一只羊驼
 * @date: 2024/1/24
 */

package java_intermediate.com.Polymorphic;

public class Cat extends Animal{
    public int age=2;
    public Cat(String name) {
        super(name);
    }
    public void say(){
        System.out.println("喵喵喵");
    }
}
