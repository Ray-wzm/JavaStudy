/**
 * @author: 一只羊驼
 * @date: 2024/1/22
 */

package java_intermediate.com.override;

/**
 * 方法重写/覆盖 override：
 * 简单的说就是子类有一个方法，和父类的某个方法名称、返回类型、参数一样，那么我们就说子类的方法覆盖了父类的方法
 */
public class override01 {
    public static void main(String args[]) {
        Dog dog = new Dog();
        dog.cry();
    }
}

