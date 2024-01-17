/**
 * @author: 一只羊驼
 * @date: 2024/1/8
 */

package java_Basics.java_obejct;

public class object01 {
    public static void main(String args[]) {
        //类是抽象的，代表一类事物，是数据类型；对象是具体的，代表里面具体的实例
        //内存图中，栈一般存放基本数据类型，局部变量；堆存放对象，数组等；方法区（常量池：存放字符串等）、类加载信息

//        张老太养了两只猫猫:一只名字叫小白,今年3岁，白色；
//        还有一只叫小花，今年18岁,花色。
//        请编写一个程序，当用户输入小猫的名字时；
//        就显示该猫的名字，年龄，颜色。
//        如果用户输入的小猫名错误,则显示 张老太没有这只猫猫。
        Cat cat1 = new Cat();//创建一只猫
        //cat1只是对象名称，new Cat（）才是真正的数据
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";
        Cat cat2 = new Cat();//创建第二只猫
        cat2 = cat1;//将cat2指向cat1  //香港管党羽同一个人改了个名字，里面的内容一模一样
//        cat2.name="小花";
//        cat2.age=18;
//        cat2.color="花色";
        System.out.println("第一只猫的信息：" + cat1.name + " ," + cat1.age + " ," + cat1.color);
        System.out.println("第二只猫的信息：" + cat2.name + " ," + cat2.age + " ," + cat2.color);
        //方法的使用（如果定义了方法没有用，则不会被执行）
        //当程序执行到方法时，就会开辟一个独立的空间
        //当方法执行完毕，或者return，就会返回给调用方法的位置，继续执行方法后面代码
        //每个栈执行完毕后都会退出(销毁)，main栈执行完毕后，程序退出
        cat1.speak();
        cat1.sum(100);
        System.out.println(cat1.sum1(10,20));
    }
}

//自定义一个猫类
class Cat {
    String name; //名字
    int age; //年龄
    String color; //花色
    //添加成员方法speak，输出喵喵喵

    /**
     * 1. public 方法是公开的
     * 2. void 方法没有返回值
     * 3. speak() speak是方法名，（）形参列表
     * 4.. {} 方法体，可以写要执行的代码
     */

    public void speak() {
        System.out.println("喵喵喵~");
    }

    //接收一个数，计算和
    public void sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum);
    }

    //接收多个数，计算和
    /**
     * 1. public 方法是公开的
     * 2. int 方法调用后返回一个int
     */
    public int sum1(int n1,int n2) {
        int sum = n1+n2;
        return sum;//执行后，return 过后，方法所开辟的空间会自动销毁
    }
}