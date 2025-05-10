// Product Discount Calculator
// Q: How do you calculate the final price of a product after applying a discount percentage?

class Product {
    String productName;
    double price;
    double discountPercentage;

    Product(String productName, double price, double discountPercentage) {
        this.productName = productName;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    double calculateFinalPrice() {
        return price - (price * discountPercentage / 100);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 80000, 10);
        Product p2 = new Product("Smartphone", 60000, 15);
        Product p3 = new Product("Headphones", 5000, 20);

        System.out.println("Final price of " + p1.productName + ": " + p1.calculateFinalPrice());
        System.out.println("Final price of " + p2.productName + ": " + p2.calculateFinalPrice());
        System.out.println("Final price of " + p3.productName + ": " + p3.calculateFinalPrice());
    }
}
