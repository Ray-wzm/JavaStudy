/**
 * @author: 一只羊驼
 * @date: 2024/2/27
 */

package java_advanced.com.Collection;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings("all")
public class HashSetExercise02 {
    public static void main(String args[]) {
        HashSet hashSet = new HashSet();
        hashSet.add(new worker("Link", 1000, new MyDate(2, 28)));
        hashSet.add(new worker("Link", 10, new MyDate(2, 28)));
        hashSet.add(new worker("Zelda", 1000, new MyDate(2, 28)));
        hashSet.add(new worker("Zelda", 1000, new MyDate(2, 27)));
        System.out.println("hashSet=" + hashSet);
    }
}

class worker {
    private String name;
    private double sal;
    private MyDate birthday;

    public worker(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "worker{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    /**
     * 当姓名和生日都相同时，返回相同的hashCode
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        worker worker = (worker) o;
        return Objects.equals(name, worker.name) &&
                Objects.equals(birthday, worker.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return month + "月，" + day + "日";
    }

    public void setDay(int day) {
        this.day = day;
    }

    /**
     * 当 月和日相同时，返回相同的hashCode
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return month == myDate.month &&
                day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, day);
    }
}