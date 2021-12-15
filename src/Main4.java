import java.util.Scanner;

public class Main4 {

    final static double PI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is radius?");
        int radius = scanner.nextInt();

        double area = calculateAreaOfCircle(radius);
        double perimeter = calculatePerimeterOfCircle(radius);
        double areaOfSector;
        int alpha;

        System.out.format("Area of the circle = %.2f\n", area);
        System.out.format("Perimeter of the circle = %.2f\n", perimeter);

        System.out.println("What is the alpha?");
        alpha = scanner.nextInt();

        areaOfSector = calculateAreaOfSector(radius, alpha);

        System.out.format("Area of the sector = %.2f\n", areaOfSector);
    }

    static double calculateAreaOfCircle(int radius) {
        return PI * radius * radius;
    }

    static double calculatePerimeterOfCircle(int radius) {
        return 2 * PI * radius;
    }

    static double calculateAreaOfSector(int radius, int alpha) {
        return (PI * radius * radius * alpha) / 360;
    }
}
