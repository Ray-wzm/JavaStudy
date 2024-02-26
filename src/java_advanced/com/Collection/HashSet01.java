/**
 * @author: 一只羊驼
 * @date: 2024/2/26
 */

package java_advanced.com.Collection;


import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("all")
public class HashSet01 {
    public static void main(String args[]) {
        //底层其实是 HashMap
        //可以存放Null值，但是只能放一个
        //不能有重复的元素、对象，不保证存放元素的顺序和取出的顺序一致;但是一旦取出，顺序不变
        Set hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println("set=" + hashSet);
        /*
        1. 执行构造器 HashSet
            public HashSet() {
                 map = new HashMap<>();
            }
         2. 执行 add
             public boolean add(E e) { e="java"
                 return map.put(e, PRESENT)==null;
             }
          3. 执行 put，该方法会执行 hash(Key) 得到 Key 对应的HashCode值
              public V put(K key, V value) {
                return putVal(hash(key), key, value, false, true);
              }
         */
    }
}
