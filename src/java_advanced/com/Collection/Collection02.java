/**
 * @author: 一只羊驼
 * @date: 2024/2/22
 */

package java_advanced.com.Collection;

import java.util.ArrayList;
import java.util.List;

public class Collection02 {
    @SuppressWarnings("all")
    public static void main(String args[]) {
        List list = new ArrayList();

        //add:添加单个元素
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("list=" + list); //list=[jack, 10, true]

        //remove:删除指定元素
        list.remove(0);//删除第一个元素
        System.out.println("list=" + list);//list=[10, true]

        //contains:查找元素是否存在
        System.out.println(list.contains(10)); //true

        //size:获取元素个数
        System.out.println(list.size()); //2

        //isEmpty:判断是否为空
        System.out.println(list.isEmpty());//false

        //cLear:清空
        list.clear();
        System.out.println("list=" + list);//list=[]
        System.out.println(list.isEmpty());//true

        //addALL:添加多个元素
        //arraylist.addAll(int index, Collection c)
        //index:元素插入处的索引值，C 表示要插入的集合元素
        ArrayList list2 = new ArrayList();
        list2.add(10);
        list2.add("jack");
        list2.add(true);
        list.addAll(list2);
        System.out.println("list=" + list);//list=[10, jack, true]

        //containsALl:查找多个元素是否都存在
        System.out.println(list.containsAll(list2));//true

        //removeALL:删除多个元素
        list.removeAll(list2);
        System.out.println(list.isEmpty());//true

    }
}

