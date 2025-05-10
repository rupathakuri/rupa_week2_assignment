// Constants Usage Example
// Q: How do you use a final constant to calculate the area and circumference of a circle?

class Circle {
    double radius;
    final double PI = 3.14159;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateCircumference() {
        return 2 * PI * radius;
    }

    double calculateArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(7.2);

        System.out.println("Circle 1 - Area: " + c1.calculateArea() + ", Circumference: " + c1.calculateCircumference());
        System.out.println("Circle 2 - Area: " + c2.calculateArea() + ", Circumference: " + c2.calculateCircumference());
    }
}
