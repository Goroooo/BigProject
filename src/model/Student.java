package model;

public class Student {

    private String name;
    private int age;
    private char gender;
    private double mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Student(){

    }
    public Student(String name, int age, char gender, double mark) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        if (mark > 0 && mark <= 100) {
            this.mark = mark;
        } else {
            System.out.println("Enter number from 1 - 100");
        }
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Mark: " + mark);
        System.out.println();
    }
}
