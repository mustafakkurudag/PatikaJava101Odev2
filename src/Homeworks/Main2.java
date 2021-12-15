package Homeworks;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This program calculates total amount
 *
 * @author Mustafa Kemal Kurudağ 15.12.2021
 */

public class Main2 {

    final static double PEAR_KILO_PRICE = 2.14;
    final static double APPLE_KILO_PRICE = 3.67;
    final static double TOMATO_KILO_PRICE = 1.11;
    final static double BANANA_KILO_PRICE = 0.95;
    final static double AUBERGINE_KILO_PRICE = 5.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pear, apple, tomato, banana, aubergine, totalAmount;

        System.out.println("How much pear?");
        pear = scanner.nextDouble();

        System.out.println("How much apple?");
        apple = scanner.nextDouble();

        System.out.println("How much tomato?");
        tomato = scanner.nextDouble();

        System.out.println("How much banana?");
        banana = scanner.nextDouble();

        System.out.println("How many aubergine?");
        aubergine = scanner.nextDouble();

        totalAmount = pear * PEAR_KILO_PRICE + apple * APPLE_KILO_PRICE + tomato * TOMATO_KILO_PRICE +
                banana * BANANA_KILO_PRICE + aubergine * AUBERGINE_KILO_PRICE;

        System.out.println("Payment total = " + new DecimalFormat("##.##").format(totalAmount));
    }
}
