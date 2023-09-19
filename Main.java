/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;


import java.util.Scanner;

// Printable interface
interface Printable {
    void print();
}

// Rectangle class
class Rectangle implements Printable {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void print() {
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + (length * breadth));
    }
}

// SportsCar class
class SportsCar implements Printable {
    private final String brandName;
    private final String model;
    private final double price;

    public SportsCar(String brandName, String model, double price) {
        this.brandName = brandName;
        this.model = model;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("SportsCar Details:");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

// Manager class
class Manager implements Printable {
    private final String name;
    private final int age;
    private final int employeeID;
    private final double salary;

    public Manager(String name, int age, int employeeID, double salary) {
        this.name = name;
        this.age = age;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: $" + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Rectangle object
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        Printable rectangle = new Rectangle(length, breadth);

        // Create SportsCar object
        System.out.print("Enter brand name of the sports car: ");
        String brandName = scanner.next();
        System.out.print("Enter model of the sports car: ");
        String model = scanner.next();
        System.out.print("Enter price of the sports car: ");
        double price = scanner.nextDouble();
        Printable sportsCar = new SportsCar(brandName, model, price);

        // Create Manager object
        System.out.print("Enter manager's name: ");
        String managerName = scanner.next();
        System.out.print("Enter manager's age: ");
        int managerAge = scanner.nextInt();
        System.out.print("Enter manager's employee ID: ");
        int employeeID = scanner.nextInt();
        System.out.print("Enter manager's salary: ");
        double managerSalary = scanner.nextDouble();
        Printable manager = new Manager(managerName, managerAge, employeeID, managerSalary);

        // Print details
        rectangle.print();
        System.out.println();
        sportsCar.print();
        System.out.println();
        manager.print();

        scanner.close();
    }
}




