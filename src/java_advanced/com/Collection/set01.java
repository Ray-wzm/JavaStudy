/**
 * @author: 一只羊驼
 * @date: 2024/2/23
 */

package java_advanced.com.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set01 {
    @SuppressWarnings("all")
    public static void main(String args[]) {
        //1. set 接口的实现类对象（Set接口对象），不能存放重复元素（自动去重），可以添加一个null
        //2. set 接口对象存放数据是无序的（即添加的顺序和取出的顺序不一致）
        //3. 取出的顺序虽然不是添加的顺序，但是固定的（不会一会一遍，底层有算法）
        Set set = new HashSet();
        set.add("john");
        set.add("link");
        set.add("marry");
        set.add("link");
        set.add("jack");
        set.add(null);
        set.add(null);
        for (int i = 1; i <= 3; i++) {
            System.out.println("set=" + set);
        }
        set.remove(null);
        //遍历
        //1. 使用迭代器
        System.out.println("====使用迭代器====");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        //2. 增强 for，set 对象没有get，不能用普通索引for
        System.out.println("====增强 For====");
        for (Object obj : set) {
            System.out.println(obj);
        }


    }
}
