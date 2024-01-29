/**
 * @author: 一只羊驼
 * @date: 2024/1/29
 */

package java_intermediate.com.HomeWork05;

public class test {
    public static void main(String args[]) {
        Doctor d1 = new Doctor("link",100,"knight",'男',1000);
        Doctor d2 = new Doctor("link",100,"knight",'男',1000);
        Doctor d3 = new Doctor("zelda",100,"princess",'女',1200);
        if(d1.equals(d2)){
            System.out.println(d1);
            System.out.println(d2);
            System.out.println("d1==d2");
        }
        if(d1.equals(d3)){
            System.out.println(d1);
            System.out.println(d3);
            System.out.println("d1==d3");
        }else{
            System.out.println(d1);
            System.out.println(d3);
            System.out.println("d1!=d3");
        }
    }
}
