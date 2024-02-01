/**
 * @author: 一只羊驼
 * @date: 2024/2/1
 */

package java_advanced.com.CodeBlock;

public class CodeBlock01 {
    //代码块，是类的一部分，属于类的成员；类似于方法，但没有方法名、返回或者参数，只有方法体
    //不通过对象或类显示调用，而是在加载类、创建对象的时候显示调用
    //相当于另外一种形式的构造器，可以做初始化操作
    //应用场景：如果多个构造器中都有重复的语句，就可以抽取到代码块中，提高代码的重用性
    public static void main(String args[]) {
        Movie movie = new Movie("爱乐之城");
        Movie movie1 = new Movie("长津湖", 78);
    }
}

class Movie {
    String name;
    double price;
    String director;

    //3个构造器构成了重载
    //（1）下面的3个构造器都有相同的语句，看起来很冗余
    //（2）可以把相同的语句抽出来放到一个代码块
    //（3）当我们不管调用哪个构造器，创建什么对象，都会调用这三行代码块

    //注意！！
    //（1）代码块前面加了Static的话就是静态代码块，随着类的加载而加载，并且只会执行一次
    //（2）普通代码块则每创建一个对象就执行一次

    //类什么时候被加载？
    //（1）创建对象实例new对象时
    //（2）创建子类对象实例时，父类也会被加载
    //（3）使用类的静态成员时（静态属性、静态方法）

    //普通的代码块，在创建对象实例的时候，会被隐式调用
    //被创建一次，就会调用一次
    //如果是使用类的静态成员，普通代码块不会被执行

    {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("电影正式开始");
    }

    public Movie(String name) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始");
//        System.out.println("电影正式开始");
        System.out.println("name构造器被调用");
        this.name = name;
    }

    public Movie(String name, double price) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始");
//        System.out.println("电影正式开始");
        System.out.println("name,price构造器被调用");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始");
//        System.out.println("电影正式开始");
        System.out.println("name、price、director构造器被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
