import model.Student;
import service.StudentService;

public class Main {
    public static void main(String[] args) {


        StudentService service = new StudentService();
        Student s1 = new Student("Gor", 28, 'm', 100);
        Student s2 = new Student("Hayk", 25, 'm', 95.6);
        Student s3 = new Student("Ani", 22, 'f', 68.2);
        Student s4 = new Student("Lilit", 23, 'f', 100);
        Student s5 = new Student("Mariam", 20, 'f', 50.8);
        Student[] students = {s1, s2, s3, s4, s5};


//        service.excellentStudents(students);
        service.scannerMenu();

    }


}
