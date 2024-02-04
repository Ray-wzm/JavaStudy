/**
 * @author: 一只羊驼
 * @date: 2024/2/4
 */

package java_advanced.com.Interface;

public class InterfacePoly {
    public static void main(String args[]) {
        //多态数组
        usb[] usbs = new usb[2];
        usbs[0] = new iphone();
        usbs[1] = new camera();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();//动态绑定
            if (usbs[i] instanceof iphone) { //判断类型并向下转型
//                iphone phone = (iphone) usbs[i];
//                phone.call();
                ((iphone) usbs[i]).call();
            }
        }
    }
}

interface usb {
    void work();
}

class iphone implements usb {
    @Override
    public void work() {
        System.out.println("iphone is working");
    }

    public void call() {
        System.out.println("phone call...");
    }
}

class camera implements usb {
    @Override
    public void work() {
        System.out.println("camera is working");
    }
}