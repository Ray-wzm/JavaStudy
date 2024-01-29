/**
 * @author: 一只羊驼
 * @date: 2024/1/29
 */

package java_intermediate.com.HomeWork06;

public class test {
    public static void main(String args[]) {
        Person[] persons = new Person[4];
        persons[0] = new Teacher("王飞", '男', 30, 5);
        persons[1] = new Teacher("王飞2", '男', 36, 5);
        persons[2] = new Student("小明", '男', 15, 00023102);
        persons[3] = new Student("小明2", '男', 18, 00023103);
        Person temp;
        int index = -1;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1; j++) {
                if (persons[i].getAge() < persons[i + 1].getAge()) {
                    temp = persons[i];
                    persons[i] = persons[i + 1];
                    persons[i + 1] = temp;
                    index = 0;
                }
                if (index == -1) {
                    return;
                }
            }
        }
        for (int i = 0; i < persons.length; i++) {
            persons[i].printMessage();
        }
    }
}
