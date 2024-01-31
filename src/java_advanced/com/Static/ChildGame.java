/**
 * @author: 一只羊驼
 * @date: 2024/1/31
 */

package java_advanced.com.Static;

public class ChildGame {
    public static void main(String args[]) {
        int count = 0;
        Child child1 = new Child("link");
        child1.join();
        child1.count++;
        Child child2 = new Child("zelda");
        child2.join();
        child2.count++;
        Child child3 = new Child("Monster");
        child3.join();
        child3.count++;
        //类变量可以通过类名直接访问
        System.out.println("共有" + Child.count + "个小孩加入了游戏");
    }
}

class Child {
    private String name;
    public static int count = 0;
    //定义一个变量count，是一个类变量（静态变量）
    //该变量最大的特点就是会被Child类的所有对象实例共享
    //static变量是同一个类所有对象共享
    //static类变量，在类加载的时候就生成了


    public Child(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(this.getName() + "小孩加入了游戏");
    }
}