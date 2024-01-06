/**
 * @author 一只羊驼
 * @date 2024/1/6
 */

package java_array;

public class array04 {
    public static void main(String args[]) {
        //数组拷贝：需要申请一样的数组空间，然后遍历数组进行值拷贝。
        int[] array1 = {1,2,3,4};
        int[] array2=new int[array1.length];
        for(int i=0;i<array1.length;i++){
            array2[i]=array1[i];
            System.out.print("array1="+array1[i]+"  ");
            System.out.print("array2="+array2[i]+"  ");
        }
        System.out.println();
        array2[0]=6;
        for(int i=0;i<array1.length;i++){
            System.out.print("修改后，array1="+array1[i]+"  ");
            System.out.print("修改后，array2="+array2[i]+"  ");
        }
    }
}
