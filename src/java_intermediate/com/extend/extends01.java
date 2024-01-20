/**
 * @author: 一只羊驼
 * @date: 2024/1/20
 */

package java_intermediate.com.extend;

public class extends01 {
    public static void main(String args[]) {
        Pupil p1 = new Pupil();
        p1.name = "塞尔达";
        p1.age = 1000;
        p1.testing();
        p1.setScore(100);
        p1.showInfo();
        System.out.println("============");
        Graduate g1 = new Graduate();
        g1.name = "林克";
        g1.age = 100;
        g1.testing();
        g1.setScore(10);
        g1.showInfo();
    }
}
