/**
 * @author: 一只羊驼
 * @date: 2024/2/5
 */

package java_advanced.com.work;

public class work06 {
    public static void main(String args[]) {
        Person zelda = new Person("Zelda", new Horse());
        zelda.ChooseVehicles("river");
        zelda.ChooseVehicles("road");

    }
}

/**
 * (1)有一个交通工具接口类Vehicles，有work接口
 * (2)有Horse类和Boat类分别实现Vehicles
 * (3)创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
 * (4)有Person类，有name和Vehicles属性，在构造器中为两个属性赋值
 * (5)实例化Person对象“唐僧”，要求一般情况下用Horse作为交通工具遇到大河时用Boat作为交通工具
 */

interface Vehicles {
    public void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("骑马，马儿奔跑...");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("划船，小船滑行...");
    }
}

class Factory {
    public static Horse getHorseInstense() {
        return new Horse();
    }

    public static Boat getBoatInstense() {
        return new Boat();
    }
}

class Person {
    private String name;
    private Vehicles Vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.Vehicles = vehicles;
    }

    public void PassRiver() {
        if (!(Vehicles instanceof Boat)) {
            Vehicles = Factory.getBoatInstense();
        }
        Vehicles.work();
    }

    public void Common() {
        if (!(Vehicles instanceof Horse)) {
            Vehicles = Factory.getHorseInstense();
        }
        Vehicles.work();
    }

    public void ChooseVehicles(String meet) {
        if (meet.equals("river")) {
            System.out.print(name);
            PassRiver();
        } else {
            System.out.print(name);
            this.Common();
        }
    }
}