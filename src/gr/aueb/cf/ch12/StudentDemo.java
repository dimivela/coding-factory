package gr.aueb.cf.ch12;

public class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student();      // Student() is a *default* constractor, a constractor without any parameters.
        Student bob = new Student(2, "Bob", "D.");  //Using the Overloaded Student Constractor.


        student.setId(1);               //student.id = 1;
        student.setFirstname("Alice");  //student.firstname = "Alice";
        student.setLastname("W.");      //student.lastname = "W.";

        System.out.println("Id: " + student.getId());
        System.out.println("Firstname: " + student.getFirstname());
        System.out.println("lastname: " + student.getLastname());

        System.out.println("Id: " + bob.getId());
        System.out.println("Firstname: " + bob.getFirstname());
        System.out.println("lastname: " + bob.getLastname());

        System.out.println("Student instances' count: " + Student.getStudentsCount());

//        System.out.println("Id: " + student.id);
//        System.out.println("Firstname: " + student.firstname);
//        System.out.println("Lastname: " + student.lastname);
    }
}
