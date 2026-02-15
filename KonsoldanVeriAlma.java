import java.util.Scanner;


public class KonsoldanVeriAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        int sayi1 = input.nextInt();
        System.out.println("Girdiginiz sayi: " + sayi1);

        System.out.print("Ondalikli bir sayi giriniz: ");
        double sayi2 = input.nextDouble();
        System.out.println("Girdiginiz sayi: " + sayi2);
        
        input.nextLine();

        System.out.print("Bir cumle giriniz: ");
        String cumle1 = input.nextLine();
        System.out.println("Yazdiginiz cumle: " + cumle1);

        input.close();
    }
}
