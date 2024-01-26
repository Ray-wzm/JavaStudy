/**
 * @author: 一只羊驼
 * @date: 2024/1/26
 */

package java_intermediate.com.Polyparameter;

public class test {
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getName() + "的年薪" + e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof employer) {
            ((employer) e).manage();
        } else if (e instanceof worker) {
            ((worker) e).work();
        }
    }
}
