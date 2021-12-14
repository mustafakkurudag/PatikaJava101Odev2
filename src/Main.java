import java.util.Scanner;

public class Main {
    /**
     * VAT = Value Added Tax
     */
    static final double VAT_LESS_THAN_1000 = 0.18;
    static final double VAT_MORE_THAN_1000 = 0.08;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the price?");
        double price = scan.nextInt();

        double newPrice = calculatePriceWithVAT(price);
        System.out.println("Calculated new price including VAT = " + newPrice);
    }

    /**
     * @param price the price value excluding vat
     *
     * @return price
     */
    static double calculatePriceWithVAT(double price) {
        if (price < 1000) {
            price = price + price * VAT_LESS_THAN_1000;
            return price;
        } else {
            price = price + price * VAT_MORE_THAN_1000;
            return price;
        }
    }
}
