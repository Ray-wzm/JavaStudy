/**
 * @author: 一只羊驼
 * @date: 2024/1/19
 */

package java_intermediate.com.modifier;

public class A {
    //四个属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 =400;

    public void test(){
        System.out.println(n1+n2+n3+n4);
    }
}
