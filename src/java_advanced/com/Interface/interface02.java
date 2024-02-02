/**
 * @author: 一只羊驼
 * @date: 2024/2/2
 */

package java_advanced.com.Interface;

public class interface02 {
    public static void main(String args[]) {
        A a = new A();
    }
}

class A implements AInterface{
    @Override
    public void hi() {
        System.out.println("hello AInterface");
    }
}