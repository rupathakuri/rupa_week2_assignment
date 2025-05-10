// Simple Contact Management
// Q: How do you display contact details only when the email address is not empty?

class Contact {
    String name;
    String phoneNumber;
    String emailAddress;

    Contact(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    void showContact() {
        if (!emailAddress.isEmpty()) {
            System.out.println("Name: " + name + ", Phone: " + phoneNumber + ", Email: " + emailAddress);
        }
    }

    public static void main(String[] args) {
        Contact c1 = new Contact("John", "1234567890", "john@example.com");
        Contact c2 = new Contact("Emma", "9876543210", "");
        Contact c3 = new Contact("Liam", "4561237890", "liam@example.com");

        c1.showContact();
        c2.showContact();
        c3.showContact();
    }
}
