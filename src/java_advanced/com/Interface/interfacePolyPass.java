/**
 * @author: 一只羊驼
 * @date: 2024/2/4
 */

package java_advanced.com.Interface;

/**
 * 演示接口的多态传递
 */
public class interfacePolyPass {
    public static void main(String args[]) {
        //接口类型的变量，可以指向实现了该接口的对象的实例
        IG ig = new Teacher();
        //如果IG继承了IH接口，而teacher实现了IG接口，那么就相当于teacher实现了IH接口
        IH ih = new Teacher();

    }
}

interface IH {
}

interface IG extends IH {
}

class Teacher implements IG {

}