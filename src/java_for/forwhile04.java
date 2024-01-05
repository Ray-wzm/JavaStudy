/**
 * @author 一只羊驼
 * @date 2024/1/4
 */

package java_for;

public class forwhile04 {
    public static void main(String args[]) {
        //打印空心金字塔11
        //4 *7 为例
        //先打印 4 * 7 矩阵
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || i == 4 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
//4 *7 为例
//先打印 4 * 7 矩阵
//        int i = 1;//列
//        int j = 1;//行
//        while (i <= 3) {
//            j = 1;
//            while (j <= 3 + i) {
//                if (j == (4 - (i - 1)) || j == (4 + (i - 1))) {
//                    System.out.print("*");
//                } else {
//                    System.out.printf(" ");
//                }
//                j++;
//            }
//            System.out.println();
//            i++;
//
//        }
//        j = 1;
//        while (j <= 2 * i - 1) {
//            System.out.print("*");
//            j++;
//        }
//    }
//}
