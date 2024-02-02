/**
 * @author: 一只羊驼
 * @date: 2024/2/2
 */

package java_advanced.com.Abstract;

public class TestTemplate {
    public static void main(String args[]) {
        new AA().calculateTime();
        new BB().calculateTime();
    }
}

class AA extends Template {
    //计算任务 1+...+1000
    public void job() {

        long num = 0;
        for (long i = 0; i <= 100000; i++) {
            num += i;
        }
    }

}

class BB extends Template {

    //计算任务 1+...+1000
    public void job() {

        long num = 0;
        for (long i = 0; i <= 80000; i++) {
            num *= i;
        }
    }

}

