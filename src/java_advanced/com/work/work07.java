/**
 * @author: 一只羊驼
 * @date: 2024/2/6
 */

package java_advanced.com.work;

public class work07 {
    public static void main(String args[]) {
        new car(42).getAir().flow();
        new car(-1).getAir().flow();
        new car(15).getAir().flow();
    }
}

class car{
    private double temperature;

    public car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            System.out.println("空调开启，开始吹风...");
            if(temperature<0){
                System.out.println("当前温度："+temperature+",低于0度，吹暖风...");
            }else if(temperature>40){
                System.out.println("当前温度："+temperature+",高于40度，吹冷风...");
            }
            else {
                System.out.println("当前温度："+temperature+",温度适宜，停止吹风...");
            }
        }
    }

    public Air getAir(){
        return new Air();
    }


}