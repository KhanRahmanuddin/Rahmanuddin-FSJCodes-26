public class Manager extends Employee {

    int number_of_projects;
    String project_name;
    int number_of_members;

    Manager(String name,String gender,String mobile,int age,String department,String employee_id,double salary,double working_hours,int number_of_projects,String project_name,int number_of_members){
        super(name, gender, mobile, age, department, employee_id, salary, working_hours);
        this.number_of_projects = number_of_projects;
        this.project_name = project_name;
        this.number_of_members = number_of_members;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Number Of Projects : " + number_of_projects);
        System.out.println("Project Names : " + project_name);
        System.out.println("Number Of Members(Per Project) : " + number_of_members);
    }
}
