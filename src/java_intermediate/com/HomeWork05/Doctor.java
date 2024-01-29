/**
 * @author: 一只羊驼
 * @date: 2024/1/29
 */

package java_intermediate.com.HomeWork05;

public class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double salary;

    public Doctor(String name, int age, String job, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        Doctor doctor = (Doctor) obj;
        if (this.getAge() == doctor.age && this.getGender() == doctor.gender && this.getSalary() == doctor.salary && this.getJob().equals(doctor.job) && this.getName().equals(doctor.name)) {
            return true;
        }
        return false;
    }
}
