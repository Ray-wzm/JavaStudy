/**
 * @author 一只羊驼
 * @date 2024/1/6
 */

package java_Basics.java_array;

public class array06 {
    public static void main(String args[]) {
        //数组的扩容
        int[] array = {1, 2, 3, 4};
        //创建一个新的数组，并将数组大小扩大为原来length+1
        int[] arrayNew = new int[array.length + 1];
        //遍历原来的数组，将原来数组的值拷贝给新数组
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }
        //将新数组最后一个空间赋值
        arrayNew[arrayNew.length - 1] = 5;
        //由于数组的拷贝是地址拷贝，所有将数组赋值给另一个数组，等价于让他指向另一个数组的地址
        // 此处，将原数组的地址指向，更改为新数组，指向新数组的地址，就可以实现源数组的扩容
        array = arrayNew;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        //数组的缩减，每次只缩减1个，当只剩下最后一个元素，提示“不能再缩减”
        do{
            int[] arrayNew2 = new int[array.length-1];
            for (int i=0;i<array.length-1;i++){
                arrayNew2[i]=array[i];
            }
            array=arrayNew2;
            System.out.println("缩减后：");
            for (int i=0;i<array.length;i++){
                System.out.print(array[i]+"\t");
            }
        }while (array.length>1);
        System.out.println("不能再缩减！");

    }
}
