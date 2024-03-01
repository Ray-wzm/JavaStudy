/**
 * @author: 一只羊驼
 * @date: 2024/2/29
 */

package java_advanced.com.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class HashMapWork {
    public static void main(String args[]) {
        HashMap hashMap = new HashMap();
        Employees employees01 = new Employees("ray",10,"001");
        Employees employees02 = new Employees("Link",10000,"002");
        Employees employees03 = new Employees("Zelda",29999,"003");
        hashMap.put(employees01.getId(),employees01);
        hashMap.put(employees02.getId(),employees02);
        hashMap.put(employees03.getId(),employees03);
        //方式1：使用entrySet
        System.out.println("====entrySet====");
        Set set = hashMap.entrySet();
        for (Object obj:set){
            Map.Entry entry = (Map.Entry) obj;
            Employees employees = (Employees) entry.getValue();
            if(employees.getSalary()>=1000){
                System.out.println(employees);
            }

        }
        //方式2：取Key
        System.out.println("====keySet====");
        Set key = hashMap.keySet();
        for (Object obj:key){
            Employees employees=(Employees)hashMap.get(obj);
            if (employees.getSalary()>=1000){
                System.out.println(employees);
            }

        }
    }
}
class Employees{
    private String name;
    private double salary;
    private String id;

    public Employees(String name, double salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }
}