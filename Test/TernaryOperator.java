package Test;

public class TernaryOperator {
    public static void main(String[] args) {
        int income =120_000;
        String  travelClass = income > 100_000 ? "Business Class": "Economy Class";
        System.out.println("Customer's income is " + income + ". So their travel class is: " + travelClass);
    }
}
