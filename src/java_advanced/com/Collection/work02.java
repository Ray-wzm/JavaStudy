/**
 * @author: 一只羊驼
 * @date: 2024/2/22
 */

package java_advanced.com.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class work02 {
    @SuppressWarnings("all")
    public static void main(String args[]) {
        List list = new ArrayList();
        list.add(new Book01("哈利波特", "JK*Rollin", 100));
        list.add(new Book01("长安的荔枝", "马伯庸", 63));
        list.add(new Book01("红楼梦", "曹雪芹", 34.6));
        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                o1 = (Book01) o1;
                o2 = (Book01) o2;
                int priceSub = (int)((Book01) o1).getPrice()-(int)((Book01) o2).getPrice();
                if (priceSub>0){
                    return 1;
                }
                else if(priceSub<0){
                    return -1;
                }
                else {
                    return 0;
                }

            }
        });
        for (Object obj:list){
            System.out.println(obj);
        }
    }
}

class Book01 {
    private String name;
    private String author;
    private double price;

    public Book01(String name, String author, double price) {
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