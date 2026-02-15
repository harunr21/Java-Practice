import java.util.Scanner;

public class NotOrtalamasiProgrami {
    public static void main(String[] args) {
        double quiz, vize, finall, ortalama;
        String sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Quiz notunuzu giriniz: ");
        quiz = input.nextDouble();

        System.out.print("Vize notunuzu giriniz: ");
        vize = input.nextDouble();

        System.out.print("Final notunuzu giriniz: ");
        finall = input.nextDouble();

        ortalama = (0.2*quiz) + (0.4*vize) + (0.4*finall);

        sonuc = (ortalama >= 50) ? "Gectiniz, tebrikler!" : "Maalesef kaldiniz :(";

        String yorum = (sonuc == "Gectiniz, tebrikler!") ? "" : "Çünkü geçme notu 50'dir.";
        System.out.println("Ortalamaniz: " + ortalama);
        System.out.println(sonuc + " " + yorum);

        input.close();

    }
}
