/**
 * @author: 一只羊驼
 * @date: 2024/2/1
 */

package java_advanced.com.Single;

public class SingleTon02 {
    public static void main(String args[]) {
        System.out.println(Cat.i);
        Cat cat = Cat.getInstance();
        System.out.println(cat);
        Cat cat1 = Cat.getInstance();
        System.out.println(cat1);
    }
}

//希望再程序运行过程中，只能创建一个Cat对象

class Cat{
    private String name;
    public static  int i =10;
    private static Cat cat; //默认是null
    /**
     * 懒汉式
     * 会有线程安全问题
     * 1. 构造器私有化
     * 2. 定义一个static静态属性对象
     * 3. 提供一个public的static方法，可以返回一个cat对象
     * @param name
     */
    private Cat(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }
    public static Cat getInstance(){
        if(cat == null){
            cat = new Cat("小花猫");
        }
        cat.toString();
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}