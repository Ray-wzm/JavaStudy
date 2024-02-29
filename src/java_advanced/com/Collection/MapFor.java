/**
 * @author: 一只羊驼
 * @date: 2024/2/29
 */

package java_advanced.com.Collection;

import java.util.*;

@SuppressWarnings("all")
public class MapFor {
    public static void main(String args[]) {
        HashMap hashMap = new HashMap();
        hashMap.put("no1", "zelda");
        hashMap.put("no2", "link");
        hashMap.put(null, "Ray");
        hashMap.put("Ray", null);
        hashMap.put("no3", "Ray");

        //方法1：先取出所有的key，通过Key取出对应的value
        Set keySet = hashMap.keySet();
        //set 可以用迭代器或者增强for遍历
        //1.1 迭代器
        Iterator iterator = keySet.iterator();
        System.out.println("====使用迭代器====");
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + hashMap.get(key));
        }
        //1.2 增强for
        System.out.println("====增强For====");
        for (Object obj : keySet) {
            System.out.println(obj + "-" + hashMap.get(obj));
        }

        //方法2:把所有的values 取出来
        Collection values = hashMap.values();
        //这里可以使用所有的Collections使用的遍历方法
        //2.1 增强 For
        System.out.println("====取出所有的value====");
        for (Object value : values) {
            System.out.println(value);
        }
        //2.2 迭代器
        System.out.println("====迭代器====");
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object value = iterator2.next();
            System.out.println(value);
        }
        //2.3 entrySet
        System.out.println("====entrySet====");
        Set set = hashMap.entrySet();
        for (Object obj : set) {
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
