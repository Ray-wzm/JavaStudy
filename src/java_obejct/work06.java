/**
 * @author: 一只羊驼
 * @date: 2024/1/15
 */

package java_obejct;

public class work06 {
    public static void main(String args[]) {
        Cale cale1 = new Cale(1,5,'+');
        System.out.println(cale1.calculate(cale1.a,cale1.b,cale1.action));
        Cale cale2 = new Cale(1,5,'*');
        System.out.println(cale2.calculate(cale2.a,cale2.b,cale2.action));
        Cale cale3 = new Cale(1,0,'/');
        System.out.println(cale3.calculate(cale3.a,cale3.b,cale3.action));
        Cale cale4 = new Cale(6,2,'/');
        System.out.println(cale1.calculate(cale4.a,cale4.b,cale4.action));
    }
}

//6.编程创建一个Cale计算类，在其中定义2个变量表示两个操作数
// 定义四个方法实现求和、差、乘、商(要求除数为0的话，要提示)并创建两个对象，分别测试.

class Cale{
    int a;
    int b;
    char action;
    public Cale(int a,int b,char action){
        this.a=a;
        this.b=b;
        this.action=action;
    }
    public int calculate(int a,int b,char action){
        if(action=='+'){
            System.out.print("a+b=");
            return a+b;
        }
        else if(action=='-'){
            System.out.print("a-b=");
            return a-b;
        }
        else if(action=='*'){
            System.out.print("a*b=");
            return a*b;
        }
        else if(action=='/'){
            System.out.print("a/b=");
            if(b==0){
                System.out.println("被除数不能是0！");
                return -1;
            }
            return a/b;
        }
        else{
            System.out.println("输入错误！");
            return -1;
        }
    }
}