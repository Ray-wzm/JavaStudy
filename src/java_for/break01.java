/**
 * @author: 一只羊驼
 * @date: 2024/1/5
 */

package java_for;

public class break01 {
    //依次计算1-100的数的和，当第一次大于20的时候跳出循环，打印次数
    public static void main(String args[]) {
        int sum =0;
        int n=0;
        for(int i=1;i<=100;i++){
            sum+=i;
            if(sum>=20){
                n=i;
                break;
            }
        }
        System.out.println("和大于等于20！i="+n);
    }
}
