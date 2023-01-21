import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r;
        double pi = 3.14;
        System.out.println("yaricap giriniz: ");
        r = scan.nextDouble();

        double cevre = 2*pi*r;
        double alan = pi*r*r;
        System.out.println("dairenin çevresi : "+cevre);
        System.out.println("dairenin alanı : "+alan);
    }
}