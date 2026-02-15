import java.util.Scanner;



public class KdvHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kdv = 0.18;
        double urun_fiyati, gercek_fiyat;

        System.out.print("Urunun fiyatini giriniz: ");
        urun_fiyati = input.nextDouble();

        gercek_fiyat = (urun_fiyati * kdv) + urun_fiyati;

        System.out.println("Urunun gercek fiyati: " + gercek_fiyat);

        input.close();

    }
    
    
}