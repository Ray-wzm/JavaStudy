/**
 * @author: 一只羊驼
 * @date: 2024/2/5
 */

package java_advanced.com.work;

public class work04 {
    public static void main(String args[]) {

        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new caulate() {
            @Override
            public int work(int n1, int n2) {
               return n1+n2;
            }
        },10,5);
    }
}

interface caulate {
    public int work(int n1, int n2);
}

class Cellphone {
    public void testWork(caulate caulate, int n1, int n2) {
        int result = caulate.work(n1, n2);
        System.out.println("计算后的结果是：" + result);
    }
}