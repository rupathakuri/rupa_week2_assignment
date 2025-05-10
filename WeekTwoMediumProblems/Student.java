// Student Grading (Switch Statement)
// Q: How do you assign letter grades based on marks using a switch or if-else ladder?

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void calculateGrade() {
        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(name + " scored " + marks + " and received grade: " + grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student("John", 92);
        Student s2 = new Student("Emma", 76);
        Student s3 = new Student("Liam", 58);

        s1.calculateGrade();
        s2.calculateGrade();
        s3.calculateGrade();
    }
}
