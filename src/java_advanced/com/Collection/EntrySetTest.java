/**
 * @author: 一只羊驼
 * @date: 2024/2/29
 */

package java_advanced.com.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class EntrySetTest {
    public static void main(String args[]) {
        HashMap hashMap = new HashMap();
        hashMap.put("no1", "zelda");
        hashMap.put("no2", "link");
        hashMap.put(new car(),new boat());
        Set set = hashMap.entrySet();//Set<Map.Entry<K,V>> entrySet()
        System.out.println(set.getClass()); //EntrySet  class java.util.HashMap$EntrySet
        for (Object obj : set) {
            System.out.println(obj.getClass());//class java.util.HashMap$Node
            //因为HashMap$Node implements Map.Entry
            //当把 HashMap$Node 对象存放到 EntrySet 就会方便我们的遍历。因为Map.entry提供了重要方法
            //getKey()、getValue()
            //1. 先做一个向下转型
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        //entry 是map的一个内部接口，实际用的是Node类，采用的是多态
        /**
         * public Set<Map.Entry<K,V>> entrySet() {
         *         Set<Map.Entry<K,V>> es;
         *         return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
         *     }
         * 执行的时候会先看有没有EntrySet类，如果没有就New一个
         */

    }
}

class car{}
class boat{}