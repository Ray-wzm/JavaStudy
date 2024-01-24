/**
 * @author: 一只羊驼
 * @date: 2024/1/24
 */

package java_intermediate.com.Polymorphic;

public class poly01 {
    public static void main(String args[]) {
        Master tom = new Master("linke");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大棒骨");
        tom.feed(dog, bone);
        Cat cat = new Cat("奶牛");
        Fish fish = new Fish("黄花鱼");
        tom.feed(cat, fish);
    }
}
