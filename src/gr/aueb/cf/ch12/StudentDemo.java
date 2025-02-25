package gr.aueb.cf.ch12;

public class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student();      // Student() is a *default* constractor, a constractor without any parameters.

        student.id = 1;
        student.firstname = "Alice";
        student.lastname = "W.";

        System.out.println("Id: " + student.id);
        System.out.println("Firstname: " + student.firstname);
        System.out.println("Lastname: " + student.lastname);
    }
}
