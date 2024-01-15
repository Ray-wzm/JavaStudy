/**
 * @author: 一只羊驼
 * @date: 2024/1/15
 */

package java_obejct;

public class work04 {
    public static void main(String args[]) {
        int[] Arr = {5,7,8,2,6};
        System.out.println("旧数组是：");
        for(int j=0;j<Arr.length;j++){
            System.out.print(Arr[j]+" ");
        }
        A03  a = new A03();
        a.copyArr(Arr);
        System.out.println("新数组是：");
        for(int i=0;i<a.copyArr(Arr).length;i++){
            System.out.print(Arr[i]+" ");
        }
    }
}

//4.编写类A03,实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样

class A03{
    int[] Arr;
    public int[] copyArr(int[] array){
        for(int i=0;i<array.length;i++){
            array[i]=this.Arr[i];
        }
        return  array;
    }
}

