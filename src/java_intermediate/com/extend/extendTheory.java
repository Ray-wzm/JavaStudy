/**
 * @author: 一只羊驼
 * @date: 2024/1/22
 */

package java_intermediate.com.extend;

/**
 * 讲解继承的本质
 */
public class extendTheory {
    public static void main(String args[]) {
        son son = new son();//new 一个子类的时候，他会先找到最顶层父类object然后开始加载
    }
}

class GrandPa { //爷类
    String name = "大头爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa { //父类
    String name = "小头爸爸";
    int age = 39;
}

class son extends Father { //子类
    String name = "大头儿子";
}