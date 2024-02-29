/**
 * @author: 一只羊驼
 * @date: 2024/2/28
 */

package java_advanced.com.Collection;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class Map01 {
    public static void main(String args[]) {
        //Map与Collection并列存在，用于保存具有映射关系的数据：Key-Value
        //Map中的Key不允许重复，value可以重复；
        //Map中的Key只能有一个null，value可以有多个null
        //常用String当作Map的Key
        //key和value之间存在单向一对一关系，即通过指定的key总能找到对应的value
        HashMap hashMap = new HashMap();
        hashMap.put("no1", "zelda");
        hashMap.put("no2", "link");
        hashMap.put("no3", "gainong");
        System.out.println(hashMap);
        System.out.println(hashMap.get("no1"));
        //for-each：就是增强for
        //使用 for-each 遍历
        Set entrySet = hashMap.entrySet();
        for (Object entry : entrySet) {
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        System.out.println();
    }
}
