/**
 * @author: 一只羊驼
 * @date: 2024/1/4
 */

package java_for;

public class forwhile03 {
    //打印金字塔
    public static void main(String args[]) {
        System.out.println(" * ");
        for(int i=2;i<=6;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
