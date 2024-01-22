/**
 * @author: 一只羊驼
 * @date: 2024/1/22
 */

package java_intermediate.com.override;

/**
 * 1. Dog是Animal的子类
 * 2. Dog的cry方法定义和Animal一样
 * 3. Dog的cry方法重写了Animal的cry方法
 */
public class Dog extends Animal{
    public void cry(){
        System.out.println("小狗汪汪叫");
    }
}
