/**
 * @author: 一只羊驼
 * @date: 2024/2/2
 */

package java_advanced.com.Interface;

public class interface01 {
    public static void main(String args[]) {
        Camera camera = new Camera();
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(phone);
        computer.work(camera);
    }
}

