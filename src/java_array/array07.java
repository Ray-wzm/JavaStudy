/**
 * @author 一只羊驼
 * @date 2024/1/6
 */

package java_array;

import java.util.Scanner;

public class array07 {
    public static void main(String args[]) {
        //灵活的数组扩容
        int[] array = {1, 2, 3, 4};
        int[] arrayNew;
        System.out.println("扩容前数组为：");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + "\t");
        }
        do{
            System.out.println("你还需要对数组扩容吗？（y/n）");
            Scanner scanner = new Scanner(System.in);
            char choice = scanner.next().charAt(0);
            if (choice == 'y') {
                System.out.println("请输入扩容的数字：");
                int num = scanner.nextInt();
                arrayNew = new int[array.length + num];
                for (int j = 0; j < array.length; j++) {
                    arrayNew[j] = array[j];
                }
                array = arrayNew;
            }
            else{
                System.out.println("不需要扩容");
                break;
            }
        }while (true);
        System.out.println("扩容后数组为：");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + "\t");
        }
    }
}
