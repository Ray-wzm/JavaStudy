/**
 * @author: 一只羊驼
 * @date: 2024/1/11
 */

package java_Basics.java_recursion;

public class recursion01 {
    public static void main(String args[]) {
        T t1 = new T();
        System.out.println("5的阶乘结果是：" + t1.factorial(5));
        System.out.println("10的斐波那契数列：" + t1.Fibonacci(10));
        System.out.println("一开始有多少桃子？ " + t1.peach(1));
    }
}

class T {
    public int factorial(int n) {
        /**
         * 1. 每次执行一个方法，会创建一个独立的栈空间
         * 2. 方法里的基本数据类型是独立的，互不影响
         * 3. 方法里的引用类型（如数组），由于数组传递的是地址，所以会共享数组里的值
         * 4. 递归必须向退出递归的条件逼近，（和循环一样，要能退出，不然会死循环），不然会报错栈溢出,starkOverFlowError
         * 5. 当一个方法执行完毕，或者遇到return语句，就会返回（谁调用，就返回给谁）
         */
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }

    //斐波那契
    public int Fibonacci(int n) {
        // 1,1,2,3...
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return Fibonacci(n - 1) + Fibonacci(n - 2);
            }
        } else return -1;
    }

    //猴子吃桃子问题:有一堆桃子，猴子第一天吃了其中的一半,并再多吃了一个!
    // 以后每天猴子都吃其中的一半，然后再多吃一个。
    // 当到第10天时想再吃时发现只有1个桃子了。
    // 问题: 最初共多少个桃子?(即还没吃)
    //逆推：
    //day10：1
    //day9：（1+day(10))*2 =（1+1）*2=4
    public int peach(int day) {
            if (day == 10) {
                return 1;
            } else if (day >= 1 && day <= 9) {
                return (peach(day+1) + 1) * 2;
            } else return -1;
    }
}