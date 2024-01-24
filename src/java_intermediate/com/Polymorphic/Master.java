/**
 * @author: 一只羊驼
 * @date: 2024/1/24
 */

package java_intermediate.com.Polymorphic;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //主人给小狗喂食骨头
    public void feed(Dog dog, Bone bone) {
        System.out.println("主人 " + name + "给小狗 " + dog.getName() + "吃 " + bone.getName());
    }

    //主人给小猫喂食黄花鱼
    public void feed(Cat cat, Fish fish) {
        System.out.println("主人 " + name + "给小猫 " + cat.getName() + "吃 " + fish.getName());
    }
    //如果不用多态，动物和食物都很多，就会造成feed函数很多，代码很冗余，不利于维护

}
