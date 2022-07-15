package com;

public class Person {
    private int age;
    private String phone;
    private String name;

    public void setAge(int age){
        this.age = age;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String getPhone(){
        return this.phone;
    }
}
