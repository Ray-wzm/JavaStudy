/**
 * @author: 一只羊驼
 * @date: 2024/3/1
 */

package java_advanced.com.Collection;

import java.util.HashMap;

@SuppressWarnings("all")
public class HashMapSource1 {
    public static void main(String args[]) {
        HashMap map = new HashMap();
        map.put("java", 10);
        map.put("php", 10);
        map.put("java", 20);
        System.out.println("map=" + map);
    }
}
