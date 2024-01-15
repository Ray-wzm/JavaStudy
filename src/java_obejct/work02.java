/**
 * @author: 一只羊驼
 * @date: 2024/1/15
 */

package java_obejct;

public class work02 {
    public static void main(String args[]) {
        A02 a = new A02();
        String[] arr = {"林克", "塞尔达", "米法"};
        int test = a.find("塞尔达", arr);
        if (test == -1) {
            System.out.println("没找到");
        } else {
            System.out.println("找到了，下标是：" + test);
        }
    }
}

//2.编写类A02，定义方法find，实现查找某字符串数组中的元素查找，并返回索引如果找不到，返回-1
class A02 {
    public int find(String message, String[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(message)) {
                index = i;
            }
        }
        return index;
    }
}