/**
 * @author: 一只羊驼
 * @date: 2024/1/24
 */

package java_intermediate.com.Polymorphic;

public class Dog extends Animal {
    public int age=8;
    public Dog(String name) {
        super(name);
    }

    public void say(){
        System.out.println("汪汪叫");
    }
}
