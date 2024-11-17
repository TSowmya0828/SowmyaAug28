package bujji;

import java.util.Scanner;

interface Utility {
    void get_details();

    void set_details();
}

class Showroom {
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stock;
    String manager_name;

    public void get_details() {
        System.out.println("Showroom Name: " + showroom_name);
        System.out.println("Showroom Address: " + showroom_address);
        System.out.println("Manager Name: " + manager_name);
        System.out.println("Total Employees: " + total_employees);
        System.out.println("Total Cars in Stock: " + total_cars_in_stock);
    }

    public void set_details() {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter Showroom Name: ");
        showroom_name = k.nextLine();

        System.out.print("Enter Showroom Address: ");
        showroom_address = k.nextLine();

        System.out.print("Enter Manager Name: ");
        manager_name = k.nextLine();

        System.out.print("Enter Total Number of Employees: ");
        total_employees = k.nextInt();

        System.out.print("Enter Total Number of Cars in Stock: ");
        total_cars_in_stock = k.nextInt();
    }
}

class Cars extends Showroom implements Utility {
    String car_name;
    String car_color;
    String car_fuel_type;
    double car_price;
    String car_type;
    String car_transmission;

    @Override
    public void get_details() {
        System.out.println("\nCar Name: " + car_name);
        System.out.println("Car Color: " + car_color);
        System.out.println("Car Fuel Type: " + car_fuel_type);
        System.out.println("Car Price: " + car_price);
        System.out.println("Car Type: " + car_type);
        System.out.println("Car Transmission: " + car_transmission);
    }

    @Override
    public void set_details() {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter Car Name: ");
        car_name = k.nextLine();

        System.out.print("Enter Car Color: ");
        car_color = k.nextLine();

        System.out.print("Enter Car Fuel Type (Petrol/Diesel): ");
        car_fuel_type = k.nextLine();

        System.out.print("Enter Car Price: ");
        car_price = k.nextDouble();

        k.nextLine(); 

        System.out.print("Enter Car Type (Sedan/SUV/Hatchback): ");
        car_type = k.nextLine();

        System.out.print("Enter Car Transmission (Automatic/Manual): ");
        car_transmission = k.nextLine();
    }
}

class Employees extends Showroom implements Utility {
    int emp_id;
    String emp_name;
    int emp_age;
    String emp_department;

    @Override
    public void get_details() {
        System.out.println("\nEmployee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Age: " + emp_age);
        System.out.println("Employee Department: " + emp_department);
        System.out.println("Associated Showroom: " + showroom_name);
    }

    @Override
    public void set_details() {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        emp_id = k.nextInt();

        k.nextLine(); 

        System.out.print("Enter Employee Name: ");
        emp_name = k.nextLine();

        System.out.print("Enter Employee Age: ");
        emp_age = k.nextInt();

        k.nextLine(); // consume newline

        System.out.print("Enter Employee Department: ");
        emp_department = k.nextLine();
    }
}

public class CarShowRoom {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        Showroom showroom = new Showroom();
        showroom.set_details();

        Cars car = new Cars();
        car.set_details();

        Employees employee = new Employees();
        employee.set_details();

        System.out.println("\n==== Showroom Details ====");
        showroom.get_details();

        System.out.println("\n==== Car Details ====");
        car.get_details();

        System.out.println("\n==== Employee Details ====");
        employee.get_details();
    }
}
