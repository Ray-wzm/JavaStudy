/**
 * @author: 一只羊驼
 * @date: 2024/3/4
 */

package java_advanced.com.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class CollectionWork02 {
    public static void main(String args[]) {
        Map map = new HashMap();
        map.put("jack", 650);
        map.put("tom", 1200);
        map.put("smith", 2900);

        //修改 jack 的工资
        map.put("jack", 2600);

        Set entrySet = map.entrySet();
        for (Object obj : entrySet) {
            Map.Entry entry = (Map.Entry) obj;
            System.out.println("员工：" + entry.getKey() + "，工资：" + ((Integer) entry.getValue() + 100));
        }


    }
}
//1)使用HashMap类实例化一个Map类型的对象m，键(String) 和值 (int) 分别用于存储员工的姓名和工资，存入数据如下:
// jack-650元;tom-1200元; smith-2900元:
//2)将iack的工资更改为2600元
//3)为所有员工工资加薪100元
//4)遍历集合中所有的员工
//5)遍历集合中所有的工资
