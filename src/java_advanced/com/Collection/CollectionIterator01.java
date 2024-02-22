/**
 * @author: 一只羊驼
 * @date: 2024/2/22
 */

package java_advanced.com.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator01 {
    @SuppressWarnings("all")
    public static void main(String args[]) {
        Collection col = new ArrayList();
        col.add(new Book("哈利波特", "JK*Rollin", 100));
        col.add(new Book("长安的荔枝", "马伯庸", 63));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));
        System.out.println("col=" + col);
        //如何一个一个取
        //1. 先得到 col 对应的迭代器
        Iterator iterator = col.iterator();
        //2. 使用 While 循环遍历
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
        //iterator.next();
        //抛出 java.util.NoSuchElementException

        //如果想要再次遍历，需要重置迭代器
        iterator = col.iterator();
        System.out.println("====二次遍历====");
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
        //Ctrl+J 显示所有快捷键
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}