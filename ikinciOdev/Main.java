package ikinciOdev;

public class Main {


    public static void main(String[] args) {
        Gladyator oyuncu1 = new Gladyator("Harun", 100, 20);
        Gladyator oyuncu2 = new Gladyator("Canavar", 100, 15);

        while (true) {
            oyuncu1.saldir(oyuncu2);
            System.out.println(oyuncu2.getIsim() + " kalan cani: " + oyuncu2.getSaglik());
            if (!oyuncu2.hayattaMi()) break; 
            oyuncu2.saldir(oyuncu1);
            System.out.println(oyuncu1.getIsim() + " kalan cani: " + oyuncu1.getSaglik());
            if (!oyuncu1.hayattaMi()) break; 


        }
    }
}
