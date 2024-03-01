/**
 * @author: 一只羊驼
 * @date: 2024/3/1
 */

package java_advanced.com.Collection;

import java.util.Hashtable;
import java.util.Properties;

@SuppressWarnings("all")
public class HashTable01 {
    public static void main(String args[]) {
        //1. 存放元素是键值对，K-V
        //2. 键值都不能是null，否则抛出空指针异常
        // hashTable是线程安全的，hashMap是线程不安全的
        Hashtable table = new Hashtable();
        table.put("Ray",100);
        table.put("link",140);
        table.put("zelda",160);
        table.put("Ray",200);
        System.out.println(table);
        Properties properties = new Properties();
        properties.put("Ray",108);
        properties.put("link",109);
        System.out.println("properties="+properties);
        //如何通过 key 获取对应值
        System.out.println(properties.get("Ray"));
        //删除
        properties.remove("Ray");
        //修改
        properties.put("link",108);
        System.out.println("properties="+properties);
    }
}
