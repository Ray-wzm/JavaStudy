/**
 * @author: 一只羊驼
 * @date: 2024/1/9
 */

package java_obejct;

import java.util.Scanner;

public class method01 {
    public static void main(String args[]) {
        //1. 一个方法只能有一个返回值，如何返回多个？用数组方式：getSumSub
        //2. return可以返回各种数据类型，包括基本数据类型和引用类型
        //3. 如果要求返回，则必须return，并且必须符合或兼容定义的数据类型
        //4. 如果方法是void，则不用返回，或者返回return;不能够带返回值
        //5. 方法不可以嵌套定义！
        A a1 = new A();
        //返回的是数组，也可以直接new 一个新的数组去接收
        System.out.println(a1.sayok()[0]);
        a1.m1();
        B b1 = new B();
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        if (b1.OddOrEven(scanner.nextInt())) {
            System.out.println("这个数是偶数");
        } else {
            System.out.println("这个数是奇数");
        }
        System.out.println("输入一个字符：");
        char c = scanner.next().charAt(0);
        b1.print(2, 2, c);

        int a = 2;
        int b = 3;
        a1.swap(a, b);
        System.out.println("main方法里，a=" + a + ",b=" + b);

        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
        a1.arrayTest(arr);//数组传递的是地址，这里相当于指向arr的地址
        //传递一个引用，相当于传递一个地址，可以通过形参引用传递修改实参数据
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
    }
}

class A {
    //同一个类中的方法，可以直接去调用，但是要注意数据类型是否兼容或一致
    public int[] getSumSub(int n1, int n2) {
        int[] resArray = new int[2];
        resArray[0] = n1 + n2;
        resArray[1] = n1 - n2;
        return resArray;
    }

    public int[] sayok() {
        return getSumSub(1, 2);
    }

    //跨类调用，如果要在A类调用B类的对象，需要通过对象名找到
    public void m1() {
        //先初始化B类的对象
        B b = new B();
        b.sayhi();
    }

    //对换两个数
    //形参的变化不影响实参
    public void swap(int a, int b) {
        System.out.println("对换前，a=" + a + ",b=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("对换后，a=" + a + ",b=" + b);
    }

    public void arrayTest(int a[]) {
        a[0] = 200;
    }

}

class B {
    //判断这个数是奇数还是偶数，返回boolean
    public boolean OddOrEven(int n) {
        return n % 2 == 0 ? true : false;
    }

    public void sayhi() {
        System.out.println("我是B类");
    }

    //根据行列，字符#，打印对应效果；如行4，列4，等于4行4列#
    public void print(int n1, int n2, char c) {
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}