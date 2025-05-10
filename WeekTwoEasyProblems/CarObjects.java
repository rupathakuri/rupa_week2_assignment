//Create a class Car with attributes brand and year. Create two Car objects in the main method and display their details.
public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2018);

        car1.displayCar();
        car2.displayCar();
    }
}

class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
