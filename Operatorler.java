
public class Operatorler {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int toplam = a + b;
        int fark = a - b;
        int carpim = a * b;
        int bolum = a / b;
        int mod = a % b;
        System.out.println("A: "+ a +" B: " + b);
        System.out.println("Toplama: " + toplam);
        System.out.println("Cikarma: " + fark);
        System.out.println("Carpma: " + carpim);
        System.out.println("Bolme: " + bolum);
        System.out.println("Mod Alma: " + mod);

        toplam++;
        System.out.println(toplam);
        fark--;
        System.out.println(fark);

        int sonuc = a++ + b--;

        System.out.println(sonuc);
        System.out.println(a);
        System.out.println(b);

        boolean esitMi = (a==b);
        System.out.println(esitMi);
        int c=06;

        a = c;
        b = c;
        esitMi = (a==b);

        System.out.println(esitMi);

        String sonuc2 = (esitMi) ? "eşittir" : "eşit değildir";

        System.out.println(sonuc2);
        a++;
        esitMi = (a==b);
        sonuc2 = (esitMi) ? "eşittir" : "eşit değildir";
        System.out.println(sonuc2);
        
    }
}
