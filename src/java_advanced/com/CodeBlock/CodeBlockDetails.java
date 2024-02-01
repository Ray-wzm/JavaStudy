/**
 * @author: 一只羊驼
 * @date: 2024/2/1
 */

package java_advanced.com.CodeBlock;

public class CodeBlockDetails {
    public static void main(String args[]) {

        //类什么时候被加载？
        //（1）创建对象实例new对象时
        //（2）创建子类对象实例时，父类也会被加载

        AA aa2 = new AA(); //先加载父类，再加载子类

        //（3）使用类的静态成员时（静态属性、静态方法）
        System.out.println(Cat.n1);

    }
}


class Cat {

    public static int n1 = 999;//静态属性

    static {
        System.out.println("Cat的静态代码块1被执行。。");
    }
}

class BB {
    static {
        System.out.println("BB的静态代码块1被执行。。");
    }
}

class AA extends BB {

    static {
        System.out.println("AA的静态代码块1被执行。。");
    }
}
