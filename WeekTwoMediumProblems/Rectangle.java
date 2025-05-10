// Rectangle and Area Calculation
// Q: How do you calculate the area of rectangles using class attributes and a method?

class Rectangle {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0, 3.0);
        Rectangle r2 = new Rectangle(10.0, 4.5);
        Rectangle r3 = new Rectangle(6.5, 2.5);

        System.out.println("Area of r1: " + r1.calculateArea());
        System.out.println("Area of r2: " + r2.calculateArea());
        System.out.println("Area of r3: " + r3.calculateArea());
    }
}
