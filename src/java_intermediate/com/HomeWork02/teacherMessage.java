/**
 * @author 一只羊驼
 * @date 2024/1/28
 */

package java_intermediate.com.HomeWork02;

public class teacherMessage {
    public static void main(String args[]) {
        Teacher[] teachers = new Teacher[3];
        teachers[0] = new Professor("Zelada", 22, "1.3", 100);
        teachers[1] = new AssociateProfessor("Linke", 35, "1.2", 90);
        teachers[2] = new Professor("boki", 100, "1.1", 50);
        for (int i = 0; i < teachers.length; i++) {
            teachers[i].introduce();
        }
    }
}
