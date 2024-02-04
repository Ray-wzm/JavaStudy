/**
 * @author: 一只羊驼
 * @date: 2024/2/2
 */

package java_advanced.com.Interface;

public class Computer {
    //编写一个方法
    //多态写法，形参是接口，只要是实现了这个接口的类的实例
    public void work(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.stop();
    }
}
