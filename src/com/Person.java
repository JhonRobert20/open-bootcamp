package com;

public class Person {
    private String name;
    private String phone;
    private int age;

    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public int getAge(){
        return this.age;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getName(){
        return this.name;
    }
}
