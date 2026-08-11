// Name : Khan Rahmanuddin
// AIM : WAP to create a program demonstrating multilevel inheritance using the classes Person, Employee, and Manager. Accept the manager details and display them. Handle invalid salary input using exception handling.
// Class : SE-COMPS(A)
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Gender : ");
            String gender = sc.nextLine();

            System.out.print("Enter Mobile : ");
            String mobile = sc.nextLine();

            System.out.print("Enter Age : ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Department : ");
            String department = sc.nextLine();

            System.out.print("Enter Employee Id : ");
            String employee_id = sc.nextLine();

            System.out.print("Enter Salary : ");
            double salary = sc.nextDouble();

            System.out.print("Enter Working Hours : ");
            double working_hours = sc.nextDouble();

            System.out.print("Enter Number Of Projects : ");
            int number_of_projects = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Project Name : ");
            String project_name = sc.nextLine();

            System.out.print("Enter Number Of Members : ");
            int number_of_members = sc.nextInt();

            Manager m1 = new Manager(name, gender, mobile, age, department, employee_id, salary, working_hours, number_of_projects, project_name, number_of_members);
            m1.display();

            sc.close();
        } catch (Exception e) {
            System.out.println("Invalid Input. Please Enter a Valid Input");
        }
    }
}
