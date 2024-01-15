/**
 * @author: 一只羊驼
 * @date: 2024/1/15
 */

package java_obejct;

public class work03 {
    public static void main(String args[]) {
        Book book1 = new Book("哈利波特", 180);
        System.out.println(book1.name + ",价格是：" + book1.price);
    }
}

//3.编写类Book，定义方法updatePrice，实现更改某本书的价格，具体:如果价格>150,则更改为150，如果价格>100,更改为100，否则不变

class Book {
    String name;
    double price;

    //创建构造器初始化
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
        if (this.price > 100) {
            updatePrice(this.price);
        }
    }

    //创建更改价格的方法
    public void updatePrice(double price) {
        if (this.price > 150) {
            this.price = 150;
        } else if (this.price > 100) {
            this.price = 100;
        }
    }

}