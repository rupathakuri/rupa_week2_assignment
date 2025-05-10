// Manual Car Showroom Inventory
// Q: How do you display only the car objects whose price is greater than 20,00,000 using an if statement?

class Car {
    String brand;
    String model;
    double price;

    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void showDetails() {
        if (price > 2000000) {
            System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Fortuner", 3200000);
        Car c2 = new Car("Hyundai", "Creta", 1500000);
        Car c3 = new Car("BMW", "X5", 7500000);
        Car c4 = new Car("Kia", "Seltos", 1900000);
        Car c5 = new Car("Mercedes", "GLE", 8500000);

        c1.showDetails();
        c2.showDetails();
        c3.showDetails();
        c4.showDetails();
        c5.showDetails();
    }
}
