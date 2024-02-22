/**
 * @author: 一只羊驼
 * @date: 2024/2/22
 */

package java_advanced.com.Collection;

import java.util.ArrayList;
import java.util.List;

public class list {
    @SuppressWarnings("all")
    public static void main(String args[]) {

        //(1) List集合类中元素有序(即添加顺序和取出顺序一致)、且可重复
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("tom");
        System.out.println("list=" + list);

        //(2) List集合中的每个元素都有其对应的顺序索引，支持索引
        //      索引是从 0 开始的
        System.out.println(list.get(3));


    }
}
