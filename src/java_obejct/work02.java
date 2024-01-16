/**
 * @author: 一只羊驼
 * @date: 2024/1/15
 */

package java_obejct;

public class work02 {
    public static void main(String args[]) {
        A02 a = new A02();
        String[] arr = {"林克", "塞尔达", "米法"};
        Integer test = a.find("塞尔达", arr);
        if (test != null) {
            if (test == -1) {
                System.out.println("没找到");
            } else {
                System.out.println("找到了，下标是：" + test);
            }
        } else {
            System.out.println("输入错误！");
        }

    }
}

//2.编写类A02，定义方法find，实现查找某字符串数组中的元素查找，并返回索引如果找不到，返回-1

//类方法里面的数据类型大写，就是包装，相当于变成了引用类型，回参可以返回对应的数据类型和空值null ?

class A02 {
    public Integer find(String message, String[] arr) {
        int index = -1;
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(message)) {
                    index = i;
                }
            }
            return index;
        } else {
            return null;
        }
    }
}