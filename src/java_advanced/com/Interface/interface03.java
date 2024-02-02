/**
 * @author: 一只羊驼
 * @date: 2024/2/2
 */

package java_advanced.com.Interface;

public class interface03 {
    public static void main(String args[]) {
        DBserver mysql = new DBserver();
        t(mysql);
        DBserver oracleDB = new DBserver();
        t(oracleDB);
    }
    public static void t(DBserver dBconnect){
        dBconnect.connect();
        dBconnect.close();
    }
}

class DBserver implements DBconnect{
    @Override
    public void connect() {
        System.out.println("链接数据库");
    }

    @Override
    public void close() {
        System.out.println("关闭数据库链接");
    }
}

