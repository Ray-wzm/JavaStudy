/**
 * @author: 一只羊驼
 * @date: 2024/2/4
 */

package java_advanced.com.InnerClass;

public class InnerClassWork {
    public static void main(String args[]) {
        //1. 传递额是实现了bell接口的匿名内部类
        //2. 重写了Ring
        new CellPhone().alamlock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        new CellPhone().alamlock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴们上课了");
            }
        });
    }
}

/**
 * 铃声接口
 * ring响铃方法
 */
interface Bell {
    void ring();
}

class CellPhone {
    public void alamlock(Bell bell) {
        bell.ring();
    }
}