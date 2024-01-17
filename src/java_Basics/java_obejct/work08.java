/**
 * @author 一只羊驼
 * @date 2024/1/15
 */

package java_Basics.java_obejct;

public class work08 {
    public static void main(String args[]) {
        Music m1 = new Music("爱乐之城", 240);
        m1.play();
        m1.getInfo();
    }
}

//9.定义Music类，里面有音乐名name、音乐时长times属性，并有播放play功能和返回本身属性信息的功能方法getlnfo.
class Music {
    String name;//音乐名
    int times;//时长

    public Music(String name, int times) {
        this.name = name;
        this.times = times;
    }

    public void play() {
        System.out.println("正在播放");
    }

    public void getInfo() {
        System.out.println("音乐名是：" + this.name + ",时长为：" + this.times);
    }
}