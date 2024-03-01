/**
 * @author: 一只羊驼
 * @date: 2024/3/1
 */

package java_advanced.com.Collection;


import java.util.Comparator;
import java.util.TreeSet;

@SuppressWarnings("all")
public class TreeSet01 {
    public static void main(String args[]) {
        //1. 当使用无参构造器，创建TreeSet时，仍然是无序的
        //2. 需求：希望添加的元素，可以按照字符串大小排序
        //3. 使用 TreeSet 提供的构造器，传入一个比较器，匿名内部类，并指定排序规则
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo((String) o2);
            }
        });
        treeSet.add("jack");
        treeSet.add("link");
        treeSet.add("zelda");
        treeSet.add("a");
        treeSet.add("ray");
        System.out.println("treeSet=" + treeSet);
        /**
         * public TreeMap(Comparator<? super K> comparator) {
         *         this.comparator = comparator;
         *     }
         * TreeSet 底层其实是 TreeMap
         * 构造器把传入的比较器对象，赋给了TreeMap
         *
         * 在调用 treeSet.add("tom")，在底层会执行
         * if (cpr != null) { //cpr就是匿名内部类
 *             do {
 *                 parent = t;
 *                 cmp = cpr.compare(key, t.key);//动态绑定
 *                 if (cmp < 0)
 *                     t = t.left;
 *                 else if (cmp > 0)
 *                     t = t.right;
 *                 else //如果相等，就返回0,加入不进去
 *                     return t.setValue(value);
 *             } while (t != null);
 *         }
         */
    }
}
