/**
 * @author: 一只羊驼
 * @date: 2024/2/5
 */

package java_advanced.com.work;

public class work05 {
    public static void main(String args[]) {
        A a = new A();
        a.show();
    }
}

class A{
    private static String name="zelda";
    public void show(){
        class B{
            private final static String name="link";
            public void show(){
                System.out.println("B的name是"+name);
            }
        }
        System.out.println("A的name是"+A.this.name);
        new B().show();
    }
}
