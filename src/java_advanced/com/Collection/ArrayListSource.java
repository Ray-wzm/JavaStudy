/**
 * @author: 一只羊驼
 * @date: 2024/2/23
 */

package java_advanced.com.Collection;

import java.util.ArrayList;
@SuppressWarnings("all")
public class ArrayListSource {
    public static void main(String args[]) {
        ArrayList list = new ArrayList();
        for (int i = 1; i <=10 ; i++) {
            list.add(i);
        }
        //ArrayList扩容，如果是有参构造，按1.5倍扩容；如果是无参构造，第一次是10，第二次按1.5倍扩容
        list.add(100);
        list.add(200);
        list.add(null);
        for(Object obj:list){
            System.out.println(obj);
        }
    }
}
