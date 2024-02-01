/**
 * @author: 一只羊驼
 * @date: 2024/2/1
 */

package java_advanced.com.Single;

public class SingleTon01 {
    public static void main(String args[]) {
        GirlFriend gf = GirlFriend.getInstance();
        System.out.println(gf);
    }
}

//只能有一个女朋友
class GirlFriend {
    private String name;

    private static GirlFriend gf = new GirlFriend("zelda");

    //如何保证只能创建一个GirlFriend对象
    private GirlFriend(String name) {
        this.name = name;
    }
    // 单例模式：饿汉式
    // 在类加载的时候就会被创建，可能存在资源浪费问题
    // 不管对象有没有被用到，类加载的时候，这个对象就已经被创建了
    //1. 将构造器私有化--防止直接New
    //2. 在类的内部创建对象 该对象是static
    //3. 提供一个公共static方法，返回gf对象

    public static GirlFriend getInstance(){
        gf.toString();
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}