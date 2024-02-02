/**
 * @author: 一只羊驼
 * @date: 2024/2/2
 */

package java_advanced.com.Abstract;

abstract public class Template {
    public abstract void job();

    public void calculateTime(){//实现方法
        //得到开始的时间
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("执行时间 "+(end-start));
    }
}
