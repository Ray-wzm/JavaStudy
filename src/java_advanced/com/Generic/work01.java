/**
 * @author: 一只羊驼
 * @date: 2024/3/5
 */

package java_advanced.com.Generic;

import java.util.ArrayList;
import java.util.Comparator;

@SuppressWarnings("all")
public class work01 {
    public static void main(String args[]) {
        ArrayList<Emp> list = new ArrayList<>();
        list.add(new Emp("Link", 200, new Date(1789, 2, 9)));
        list.add(new Emp("Zelda", 100, new Date(1769, 12, 2)));
        list.add(new Emp("Ray", 200, new Date(2000, 2, 29)));
        list.add(new Emp("Ray", 200, new Date(2000, 2, 28)));
        list.sort(new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                int i = o1.getName().compareTo(o2.getName());
                System.out.println(i);
                if (i != 0) {
                    return i;
                }
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }
}

class Emp {
    private String name;
    private double sal;
    Date birthday;

    public Emp(String name, double sal, Date birthday) {
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", " + birthday +
                '}';
    }
}

class Date implements Comparable<Date> {
    private int Year;
    private int Month;
    private int Day;

    public Date(int year, int month, int day) {
        Year = year;
        Month = month;
        Day = day;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    @Override
    public String toString() {
        return "Birthday[" +
                "Year=" + Year +
                ", Month=" + Month +
                ", Day=" + Day +
                ']';
    }

    @Override
    public int compareTo(Date o) {
        int year = Year - o.getYear();
        if (year != 0) {
            return year;
        }
        int month = Month- o.getMonth();
        if (month != 0) {
            return month;
        }
        return Day - o.getDay();
    }
}
