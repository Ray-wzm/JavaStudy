/**
 * @author: 一只羊驼
 * @date: 2024/3/5
 */

package java_advanced.com.Generic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
@SuppressWarnings("all")
public class generic02 {
    public static void main(String args[]) {
        //泛型里面，k和v只能是引用类型，不能是数据类型，如，只能是 Integer，不能是 Int
        //推荐简写，编译器会自动推断运行类型的泛型；如果全部不指定，则默认是Object
        HashSet<Student> students = new HashSet<>();
        //HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("john", 12));
        students.add(new Student("Zelda", 18));
        for (Student s : students) {
            System.out.println(s);
        }
        //key是学生姓名，value是学生对象
        HashMap studentHashMap = new HashMap<String, Student>();
        studentHashMap.put("Link", new Student("Link", 10));
        studentHashMap.put("Zelda", new Student("Zelda", 18));
        Set entrySet = studentHashMap.entrySet();
        for (Object s : entrySet) {
            Map.Entry entry = (Map.Entry) s;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}