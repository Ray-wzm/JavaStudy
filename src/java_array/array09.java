/**
 * @author 一只羊驼
 * @date 2024/1/6
 */

package java_array;

import java.util.Scanner;

public class array09 {
    public static void main(String args[]) {
        //查找：顺序查找+二分查找
        //有一个数列：林克、莫利布林、波克布林、塞尔达
        //从键盘中任意输入一个名称，判断数列中是否包含此名称【顺序查找】
        //要求：如果找到了，就提示找到，并给出下标
        String[] array = {"林克", "莫利布林", "波克布林", "塞尔达"};
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要查找的名称：");
            String name = scanner.next();
            int index = -1;//设置一个下标用来判断有没有找到人
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(name)) {
                    System.out.println("找到了！下标是：" + i);
                    index = i;//如果找到了就给他重新赋值
                    break;
                }
            }
            if (index == -1) { //如果值还是初始值，说明没找到！
                System.out.println("没有这个人！");
            }
            System.out.println("继续查找吗？（y/n）");
            char choice = scanner.next().charAt(0);
            if (choice == 'n') {
                break;
            }
        } while (true);
    }
}
