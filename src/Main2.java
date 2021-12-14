import java.util.Scanner;

/**
 * This class for calculation area of a triangle
 *
 * @author Mustafa Kemal Kurudağ
 */
public class Main2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b;
        double c, d, e, area;

        System.out.print("First leg: ");
        a = scan.nextInt();

        System.out.print("Second leg: ");
        b = scan.nextInt();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hipotenus = " + c);

        d = a + b + c;
        System.out.println("The perimeter of the triangle = " + d);

        e = d / 2;

        area = Math.sqrt(e * (e - a) *  (e - b) * (e - c));
        System.out.println("The area of the triangle = " + area);

    }
}
