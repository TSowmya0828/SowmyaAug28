package bujji;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = sc.nextLine();

        System.out.println("Enter age of student:");
        int age = sc.nextInt();

        System.out.println("Marks in Telugu:");
        double tgrade = sc.nextDouble();

        System.out.println("Marks in Hindi:");
        double hgrade = sc.nextDouble();

        System.out.println("Marks in English:");
        double egrade = sc.nextDouble();

        double avggrade = (tgrade + hgrade + egrade) / 3;

        String classify;
        if (avggrade >= 75) {
            classify = "First class";
        } else if (avggrade >= 60) {
            classify = "Second class";
        } else if (avggrade >= 40) {
            classify = "Pass";
        } else {
            classify = "Fail";
        }

        System.out.println("\n***** Student Report Card *****");
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Telugu Grade: " + tgrade);
        System.out.println("Hindi Grade: " + hgrade);
        System.out.println("English Grade: " + egrade);
        System.out.println("Grade Classification: " + classify);

        sc.close();
    }
}
