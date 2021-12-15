import java.util.Scanner;

public class Main3 {

    final static double AMOUNT_PER_KM = 2.20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Distance traveled: ");

        int distance = scanner.nextInt();

        double totalAmount = calculateTaximeter(distance);

        System.out.println("The Amount you should pay: " + totalAmount);

    }

    static double calculateTaximeter(int distance) {
        double startAmount = 10;

        double amount = startAmount + distance * AMOUNT_PER_KM;

        if (amount < 20) {
            amount = 20;
        }

        return amount;
    }
}
