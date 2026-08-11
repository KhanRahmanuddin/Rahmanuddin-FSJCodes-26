public class Employee extends Person {

    String department;
    String employee_id;
    double salary;
    double working_hours;

    Employee(String name,String gender,String mobile,int age,String department,String employee_id,double salary,double working_hours){
        super(name, gender, mobile, age);
        this.department = department;
        this.employee_id = employee_id;
        this.salary = salary;
        this.working_hours = working_hours;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Department : " + department);
        System.out.println("Employee ID : " + employee_id);
        System.out.println("Salary(Monthly) : " + salary);
        System.out.println("Working Hours(Per Week) : " + working_hours);
    }
}
