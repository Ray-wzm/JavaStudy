/**
 * @author: 一只羊驼
 * @date: 2024/2/22
 */

package java_advanced.com.Collection;

import java.util.ArrayList;
import java.util.List;

public class list02 {
    public static void main(String args[]) {
        List list = new ArrayList();
        for (int i = 1; i < 12; i++) {
            list.add("这是" + i);
        }
        for(Object obj:list){
            System.out.println(obj);
        }
        System.out.println("获得了第五个元素：");
        System.out.println(list.get(4));
        System.out.println("删除第六个元素");
        list.remove(5);
        System.out.println(list);
        list.set(6,"这是"+7);
        System.out.println(list);
    }
}
