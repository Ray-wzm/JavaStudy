/**
 * @author: 一只羊驼
 * @date: 2024/2/23
 */
package java_advanced.com.Collection;

import java.util.Vector;

@SuppressWarnings("all")
public class Vector01 {
    public static void main(String args[]) {
        //1. 线程安全，效率不高
        //2. 无参构造器，默认10，之后按2倍扩容；有参构造器，按2倍扩容
        Vector vector = new Vector();
        for (int i = 1; i <= 10; i++) {
            vector.add(i);
        }
        vector.add(101);
        vector.add(100);
        for(Object obj:vector){
            System.out.println(obj);
        }
    }
}
