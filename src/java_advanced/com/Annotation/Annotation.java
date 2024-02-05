/**
 * @author: 一只羊驼
 * @date: 2024/2/5
 */

package java_advanced.com.Annotation;

import java.util.ArrayList;
import java.util.List;

public class Annotation {
    //可以指定某些警告不显示
    @SuppressWarnings({"rawtypes","unchecked","unused"})
    public static void main(String args[]) {
        //@Override : 限定某个方法，是重写父类方法，该注解只能用于方法
        //@Deprecated: 勇敢与表示某个程序元素（类，方法等）已过时
        //@SuppressWarnings: 抑制编译器警告
        //@Target 是修饰注解的注解，我们称之为元注解
        C c = new C();//有横线，说明这个类是过时的
        List List = new ArrayList();

        List.add("jack");
        List.add("tom");
        List.add("link");
        int i;
        System.out.println(List.get(1));
    }
}

class A{
    public void say(){}
}

class B extends A{
    @Override
    //1. 表示子类的say方法，重写了父类的say方法；只能修饰放方法，不能修饰其他
    //2. 如果写了Override注解，编译器就回去检查是否确实重写了父类方法，如果确实重写了，就通过，没有就报错；
    public void say() {
        System.out.println("hi");
    }

}

//1. 过时只是不推荐使用，但是可以用
//2. 可以用于过渡版本
@Deprecated
class C{
    public int n1=10;
    public void hi(){
        System.out.println("hi"+n1);
    }
}

