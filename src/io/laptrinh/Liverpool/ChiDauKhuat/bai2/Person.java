package io.laptrinh.Liverpool.ChiDauKhuat.bai2;

public class Person {
    String name;
    String address;
    int age;
    String number;

    public Person(String name, String address,int age,String number){
        this.name = name;
        this.address = address;
        this.age = age;
        this.number = number;
    }

    public int getAge() {
        return age;
    }
}
