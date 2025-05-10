// Employee Bonus Calculation
// Q: How do you calculate a bonus based on years of experience using if-else logic?

class Employee {
    String name;
    double salary;
    int yearsOfExperience;

    Employee(String name, double salary, int yearsOfExperience) {
        this.name = name;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    void calculateBonus() {
        double bonus;
        if (yearsOfExperience > 5) {
            bonus = 0.20 * salary;
        } else {
            bonus = 0.10 * salary;
        }
        System.out.println(name + " gets a bonus of: " + bonus);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 50000, 6);
        Employee e2 = new Employee("Bob", 45000, 3);
        Employee e3 = new Employee("Charlie", 60000, 8);

        e1.calculateBonus();
        e2.calculateBonus();
        e3.calculateBonus();
    }
}
