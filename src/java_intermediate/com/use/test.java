/**
 * @author: 一只羊驼
 * @date: 2024/1/17
 */

package java_intermediate.com.use;

import java_intermediate.com.xiaoqiang.Dog;

public class test {
    public static void main(String args[]) {
        //当一个文件下有相同的类，如果不引入包，new 的时候就要引入包名；如果new多个，第二个就需要写完整包名
        //命名规范：com.公司名.项目名.业务模块名
        Dog dog = new Dog();
        System.out.println(dog);
        java_intermediate.com.xiaoming.Dog dog1 = new java_intermediate.com.xiaoming.Dog();
        System.out.println(dog1);
    }
}
