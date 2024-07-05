import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        double d_alan, d_cevre;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını gir: ");
        r = input.nextInt();

        d_alan = pi * r * r;
        d_cevre = 2 * pi * r;

        System.out.println("Dairenin alanı: " + d_alan);
        System.out.println("Dairenin çevresi: " + d_cevre);
    }
}
