/**
 * @author: 一只羊驼
 * @date: 2024/3/6
 */

package java_advanced.com.Generic;

import org.junit.Test;

import java.util.*;

public class work02 {
    public static void main(String args[]) {

    }

    @Test
    public void testList() {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("001", new User(1, 10, "jack"));
        userDAO.save("002", new User(2, 11, "jane"));
        userDAO.save("003", new User(3, 12, "jame"));

        List<User> list = userDAO.list();
        System.out.println("list=" + list);
        userDAO.update("001", new User(1, 18, "link"));
        System.out.println("修改后");
        System.out.println("list=" + list);
    }
}

class DAO<T> {
    //定义一个Map成员变量，Map的键为 String 类型，值是 T 类型
    private Map<String, T> Map = new HashMap<>();

    public void save(String id, T entity) {
        Map.put(id, entity);
    }

    public T get(String id) {
        return Map.get(id);
    }

    public void update(String id, T entity) {
        Map.put(id, entity);
    }

    public void delete(String id) {
        Map.remove(id);
    }

    //返回 Map 中存放的所有 T 对象
    public List<T> list() {
        List<T> list = new ArrayList<>();
        Set<String> keySet = Map.keySet();
        for (String Key : keySet) {
            list.add(Map.get(Key));
        }
        return list;
    }

}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}