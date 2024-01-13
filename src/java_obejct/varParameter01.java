/**
 * @author 一只羊驼
 * @date 2024/1/13
 */

package java_obejct;

public class varParameter01 {
    public static void main(String args[]) {
        //java允许将同一个类中多个同名同功能但是参数个数不同的方法，封装成一个方法；可变参数实现
        HspMethod method = new HspMethod();
        System.out.println("参数和=" + method.sum(4, 5, 6, 7, 2, 1));
        //细节：可变参数的实参，可以是数组;可变参数的本质就是数组！
        System.out.println("实参传数组演示：");
        int[] arr = {4, 5, 6, 7, 2, 1};
        System.out.println("参数和=" + method.sum(arr));
    }
}

class HspMethod {
    //可以计算2个数的和，3个数的和，4，5....
    //方法名称相同，功能相同，参数个数不同--》使用可变参数优化
    public int sum(int... parameters) {
        //1. int... 表示接受的是可变参数，类型是int，即可以接受多个int(0->多)
        //2. 使用可变参数时，可以当作数组来使用，即parameters可以当作是数组
        //3. 细节！可变参数可以和普通参数一起传到方法里，但是可变参数必须放在最后
        //4. 细节！一个形参列表里面，只能有一个可变参数
        int sum = 0;
        System.out.println("接收的参数的个数=" + parameters.length);
        for (int i = 0; i < parameters.length; i++) {
            sum += parameters[i];
        }
        return sum;
    }
}