public class Person {

    String name;
    String gender;
    String mobile;
    int age;

    Person(String name,String gender,String mobile,int age){
        this.name = name;
        this.gender = gender;
        this.mobile = mobile;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Mobile Number : " + this.mobile);
        System.out.println("Gender : " + this.gender);
    }
}
