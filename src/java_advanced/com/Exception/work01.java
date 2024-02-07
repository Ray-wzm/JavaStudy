/**
 * @author: 一只羊驼
 * @date: 2024/2/6
 */

package java_advanced.com.Exception;

public class work01 {
    public static void main(String args[]) {
        try {
            //先验证输入参数个数是否正确，要传两个参数
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            //先把接收到的参数转成整数
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = n1 / n2;
            System.out.println("计算结果 = " + res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确，需要输入整数");
        } catch (ArithmeticException e) {
            System.out.println("被除数不能是 0 ");
        }
    }
}

