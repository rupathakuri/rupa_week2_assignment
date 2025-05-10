//Write a Java program to check if a person is eligible to vote. (The person must be 18 or older and a citizen.)
public class VotingEligibility {
    public static void main(String[] args) {
        int age = 19;
        boolean isCitizen = true;

        if (age >= 18 && isCitizen) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}
