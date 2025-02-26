/*
Author BSE-01-0032/2024
Description: Java program to compute employee Basic salary and Net pay
*/
import java.util.Scanner;

class Person {

    Scanner input = new Scanner(System.in);
    int age;
    double basic_pay, house_allowance, tax, gross_pay, net_sal;
    String name, change_address;

    void personal() {
        System.out.println("Enter name: ");
        name = input.nextLine();
        System.out.println("Enter age: ");
        age = input.nextInt();
        input.nextLine();
        System.out.println("Enter change_address: ");
        change_address = input.nextLine();
    }
}

class Teacher extends Person {

    void teacher() {
        personal();
        System.out.println("Enter Basic Pay: ");
        basic_pay = input.nextDouble();
        System.out.println("Enter House Allowance: ");
        house_allowance = input.nextDouble();
        System.out.println("Enter tax: ");
        tax = input.nextDouble();
        compute_netSal();
        displayDetails();
    }

    void compute_netSal() {
        gross_pay = basic_pay + house_allowance;
        net_sal = gross_pay - (gross_pay * tax / 100);
    }

    void displayDetails() {
        System.out.println(".....Printing Results.....");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address Change: " + change_address);
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("House Allowance: " + house_allowance);
        System.out.println("Tax: " + tax + "%");
        System.out.println("Gross Pay: " + gross_pay);
        System.out.println("Net Salary: " + net_sal);
    }
}

    public class person {

        public static void main(String[] args) {
            Teacher Teachers = new Teacher();
            Teachers.teacher();
        }
    }
