/**
 * @author: 一只羊驼
 * @date: 2024/2/4
 */

package java_advanced.com.InnerClass;

public class InnerClassExercise01 {
    public static void main(String args[]) {
        //匿名内部类可以当作实参直接传递c，本质是个对象
        f1(new IL(){
            @Override
            public void show() {
                System.out.println("内部类实现接口");
            }
        });
    }
    //静态方法，形参是接口类型
    public static void f1(IL il){
        il.show();
    }
}
//接口
interface IL{
    void show();
}
