package service;


import model.Student;

import java.util.Scanner;

public class StudentService {


    boolean isActiveMenu = true;

    public void scannerMenu() {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        while (isActiveMenu) {
            System.out.println("------- Menu -------");
            System.out.println("1. Create Student");
            System.out.println("2. Show excellent students");
            System.out.println("3. Show only female students");
            System.out.println("4. Exit");

            int menuNumber = scanner.nextInt();
            switch (menuNumber) {
                case 1:
                    createStudent();
                    break;
                case 2:
                    excellentStudents(students);
                case 3:
                    onlyGirls(students);
            }
        }
    }


    public Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter gender: 'f' for female or 'm' for male:");
        char gender = scanner.next().charAt(0);
        System.out.println("Enter mark:");
        double mark = scanner.nextDouble();
        return new Student(name, age, gender, mark);
    }

    public void excellentStudents(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if (student.getMark() == 100) {
                student.printInfo();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There are no excellent students");
        }
    }

    public void onlyGirls(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender() == 'f') {
                students[i].printInfo();
            }
        }
    }

}
