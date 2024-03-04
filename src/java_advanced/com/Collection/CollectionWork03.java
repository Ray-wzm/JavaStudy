/**
 * @author: 一只羊驼
 * @date: 2024/3/4
 */

package java_advanced.com.Collection;


import java.util.HashSet;

@SuppressWarnings("all")
public class CollectionWork03 {
    public static void main(String args[]) {
        HashSet set = new HashSet();
        Person01 p1 = new Person01(001, "Ray");
        Person01 p2 = new Person01(002, "Link");
        Person01 p3 = new Person01(003, "Zelda");
        set.add(p1);
        set.add(p2);
        set.add(p3);
        p1.name = "cc";
        System.out.println(set);
        set.remove(p1);
        System.out.println(set);
        set.add(new Person01(001, "cc"));
        System.out.println(set);
        set.add(new Person01(001, "Ray"));
        System.out.println(set);

    }
}

class Person01 {
    int ID;
    String name;

    public Person01(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}