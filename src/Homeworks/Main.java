package Homeworks;

import java.util.Scanner;

/**
 * This program calculates body-mass-index
 *
 * @author Mustafa Kemal Kurudağ
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double weight, height, bmi;

        System.out.println("What is your weight?");
        weight = scanner.nextDouble();

        System.out.println("What is your height?");
        height = scanner.nextDouble();

        if (height > 2.5) {
            throw new Exception("Please enter your height in meters.");
        }

        bmi = calculateBMI(weight, height);
        System.out.format("Your body mass index = %.2f", bmi);
    }

    static double calculateBMI(double weight, double height) {
        return weight / Math.pow(height, 2);
    }


}
