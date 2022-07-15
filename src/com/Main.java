package com;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        Worker worker = new Worker();

        client.setAge(23);
        worker.setAge(23);

        client.setName("Paco");
        worker.setName("Raul");

        client.setPhone("+34123456789");
        worker.setPhone("+34123456789");

        client.setCredit(1230.00);
        worker.setSalary(1234.252);

        System.out.println("Worker data");
        System.out.println("name: " + worker.getName());
        System.out.println("Age: "+ worker.getAge());
        System.out.println("Phone: " + worker.getPhone());
        System.out.println("Salary: " + worker.getSalary());

        System.out.println("\nClient data");
        System.out.println("Name: " + client.getName());
        System.out.println("Age: " + client.getAge());
        System.out.println("Phone: " + client.getPhone());
        System.out.println("Credit: " + client.getCredit());
    }
}
