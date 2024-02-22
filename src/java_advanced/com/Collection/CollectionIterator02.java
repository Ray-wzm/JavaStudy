/**
 * @author: 一只羊驼
 * @date: 2024/2/22
 */

package java_advanced.com.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionIterator02 {
    @SuppressWarnings("all")
    public static void main(String args[]) {
        Collection col = new ArrayList();
        col.add(new Book("哈利波特", "JK*Rollin", 100));
        col.add(new Book("长安的荔枝", "马伯庸", 63));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));
        //使用增强For循环，底层是迭代器，可以理解为简化版本的迭代器
        for(Object Book:col){
            System.out.println("book="+Book);
        }
    }
}
