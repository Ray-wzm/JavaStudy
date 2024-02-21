/**
 * @author: 一只羊驼
 * @date: 2024/2/21
 */

package java_advanced.com.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod03 {
    public static void main(String args[]) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("西游记", 150);
        books[2] = new Book("水浒传", 200);
        books[3] = new Book("三国演义", 300);
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                int payVal = book2.getPrice() - book1.getPrice();

                if (payVal > 0) {
                    return 1;
                } else if (payVal < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));
    }

}

class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}