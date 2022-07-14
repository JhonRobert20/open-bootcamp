package com;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getAge());
        person.setAge(10);
        System.out.println(person.getAge());
        System.out.println(person.getPhone());
        person.setPhone("+34 616263649");
        System.out.println(person.getPhone());
        System.out.println(person.getName());
        person.setName("John");
        System.out.println(person.getName());
    }
}
