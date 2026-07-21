/*
Aim : WAP to store and display student information of few students.
      Information like name, uin, cgpa.
Coder : Khan Rahmanuddin
Class : SE COMPS DIV A
*/
public class Student {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo();
        s1.name = "Rahmanuddin";
        s1.UIN = "251P049";
        s1.cgpa = 8.71;
        s1.display();

        StudentInfo s2 = new StudentInfo();
        s2.name = "Mayuresh";
        s2.UIN = "251P016";
        s2.cgpa = 8.54;
        s2.display();

        StudentInfo s3 = new StudentInfo();
        s3.name = "Shaad";
        s3.UIN = "251P058";
        s3.cgpa = 8.4;
        s3.display();
    }
}

class StudentInfo {
    String name;
    String UIN;
    double cgpa;

    void display() {
        System.out.println("-->Name of student is: " + name);
        System.out.println("    UIN of student is: " + UIN);
        System.out.println("    Cgpa of student is: " + cgpa);
        System.out.println("----------------------------------");
    }
}
