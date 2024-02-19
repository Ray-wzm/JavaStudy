/**
 * @author: 一只羊驼
 * @date: 2024/2/19
 */

package java_advanced.com.String;

public class StringBuffer03 {
    public static void main(String args[]) {
        String price = "23748752.4";
        StringBuffer sb = new StringBuffer(price);
        //找到小数点的索引，找到小数点的前三位插入
        for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb = sb.insert(i, ",");
        }
        System.out.println(sb);
    }
}
