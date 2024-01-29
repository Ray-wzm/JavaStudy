/**
 * @author 一只羊驼
 * @date 2024/1/28
 */

package java_intermediate.com.HomeWork01;

public class Homework01 {
    /**
     * 定义Person类(name,age,job)，初始化person数组，有3个person对象，按照age从大到小进行排序，使用冒泡排序
     *
     * @param args
     */
    public static void main(String args[]) {
        Person[] persons = new Person[3];
        persons[0] = new Person("Zelda", 22, "Princess");
        persons[1] = new Person("linke", 25, "Knight");
        persons[2] = new Person("gainong", 100, "Monster");
        //冒泡排序
        Person temp;
        int index = -1;
        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length - 1; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;
                    index = 0;
                }
            }
            if (index == -1) {
                return;
            }
        }

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
        }
    }
}

/**  写出四种访问修饰符和各自的访问权限
 *
 *              本类     同包   子类   不同包
 * private       T      F      F     F
 * public        T      T      T     T
 * protected     T      T      T     F
 * null          T      T      F     F
 */