/**
 * @author: 一只羊驼
 * @date: 2024/2/2
 */

package java_advanced.com.Interface;

public class interfaceDetail01 {
    public static void main(String args[]) {
//        new IA();
//        1. 接口本身是一个抽象的概念，需要别的方法去实现，不能被实例化
//        2. 接口中所有方法都是public的，接口中抽象方法，可以不用abstract修饰
//        3. 一个普通类实现接口，就必须将该接口所有方法都实现
//        4. 抽象类实现接口，可以不用实现接口的方法
//        5. 接口中的属性只能是final的
//        6. 接口不能继承其他类，但是可以继承其他接口
        A1 a1 = new A1();
        System.out.println(IA.i);//IA.1\A1.i\a1.i 都可以访问到 i =10
    }
}

interface IA {
    void say();

    public void hi();

    public int caulate();

    int i = 10;//等价于 public static final int i = 10;
}

class A1 implements IA { //ALT+ENTER 可以快速实现接口所有方法

    @Override
    public void say() {
        System.out.println("say被调用");
    }

    @Override
    public void hi() {
        System.out.println("hi被调用");
    }

    @Override
    public int caulate() {
        return 100;
    }
}

