import java.text.DecimalFormat;
import java.util.Scanner;

public class DaireAlanHacimHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;

        System.out.print("Yari cap girin: ");
        double yari_cap = input.nextDouble();

        double cevre = 2 * pi * yari_cap;
        double alan = pi * yari_cap * yari_cap;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Dairenin cevresi: " + df.format(cevre));
        System.out.printf("Dairenin alani: " + df.format(alan) + "\n"); 

        input.close();
    }
}
