/**
 * @author: 一只羊驼
 * @date: 2024/1/25
 */

package java_intermediate.com.dynamic;

public class B extends A{
    public int i =20;

    @Override
    public int getI() {
        return i;
    }

    public int sum(){
        return getI()+10;
    }

    public int sum1(){
        return i+10;
    }
}
