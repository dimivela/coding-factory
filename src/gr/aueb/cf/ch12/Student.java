package gr.aueb.cf.ch12;

/**
 * Data class.
 * POJO (Plain Old Java Object)
 * Java Bean
 */
public class Student {
    private static int studentsCount = 0;

    private int id;
    private String firstname;
    private String  lastname;

    //Default Constractor
    public Student() {
        studentsCount++;
    }

    //Overloaded Constractor
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }

    public static int getStudentsCount() {
        return studentsCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    //    //Default Constractor
//    public Student() {
//        id = 0;
//        firstname = null;
//        lastname = null;
//    }
//
//    //Getter
//    public int getId() {
//        return id;
//    }
//
//    //Setter
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
}
