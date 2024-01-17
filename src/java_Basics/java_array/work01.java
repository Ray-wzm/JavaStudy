/**
 * @author 一只羊驼
 * @date 2024/1/7
 */

package java_Basics.java_array;

public class work01 {
    public static void main(String args[]) {
        //已知有个升序的数组，要求插入一个元素，该数组依然是升序，比如：[10，12，45，90]
        //添加23以后，数组为[10,12,34,45,90]
        int arr[]={10,12,45,90};
        int index=-1;//定义一个index用来定位插入的位置
        int insertNum=23;//定义要插入的数据
        for(int i=0;i<arr.length;i++){
            if(insertNum<arr[i]){
                index=i;
                break;
            }
        }
        //遍历完还是-1，说明应该添加到数组的最后
        if(index==-1){
            index=arr.length;
        }
        //数组的扩容，定义一个新数组监听新的长度
        int arrNew[]=new int[arr.length+1];
        //将原数组的值复制到新的数组中，并且跳过index的位置
        for(int i=0, j=0;i<arrNew.length;i++){
            if(i!=index){
                arrNew[i]=arr[j];
                j++;
            }
            else{
                arrNew[i]=insertNum;
            }

        }
        arrNew[index]=insertNum;

//        for(int i=0;i<arr.length;i++){
//            arrNew[i]=arr[i];
//        }
//        arrNew[arrNew.length-1]=23;
//        //冒泡排序，内外层循环length-1次
//        for(int j=0;j<arrNew.length-1;j++){
//            for(int i=0;i<arrNew.length-1;i++){
//                int temp=0;
//                if (arrNew[i] > arrNew[i + 1]) {
//                    temp = arrNew[i];
//                    arrNew[i] = arrNew[i + 1];
//                    arrNew[i + 1] = temp;
//                }
//            }
//        }
        arr=arrNew;
        for(int i=0;i<arr.length;i++){
            System.out.printf(arr[i]+" ");
        }

    }
}
