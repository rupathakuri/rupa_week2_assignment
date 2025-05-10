//Create a class Student with two attributes: name and age. Create a method displayInfo() that prints the student's name and age. In the main method, create a Student object and call displayInfo().
public class StudentInfo {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Alice";
        student1.age = 20;
        student1.displayInfo();
    }
}

class Student {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
