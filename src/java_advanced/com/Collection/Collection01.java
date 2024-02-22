/**
 * @author: 一只羊驼
 * @date: 2024/2/22
 */

package java_advanced.com.Collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection01 {
    @SuppressWarnings("all")
    public static void main(String args[]) {
        //1. 集合主要是两组：单列集合（单个的对象）、双列集合（键值对的形式）
        //2. Collection 接口有两个重要的子接口，list、set,实现子类都是单列集合
        //3. Map 接口的实现子类是 双列集合，存放的是 K-V
        ArrayList arrayList = new ArrayList(); //单列
        arrayList.add("jack");
        arrayList.add("Tom");

        HashMap hashMap = new HashMap(); //双列
        hashMap.put("Ray","beijing");
        hashMap.put("Tom","shanghai");
    }
}
