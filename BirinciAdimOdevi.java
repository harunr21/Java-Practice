import java.util.Scanner;

public class BirinciAdimOdevi {

    public static void notlariYazdir(String[] isimler, int[] notlar, int OgrenciSayisi){

        for(int i = 0 ; i < OgrenciSayisi ; i++){
            System.out.println(isimler[i] + ": " + notlar[i]);
        }
    }

    public static double ortalamaHesapla(int[] notlar, int OgrenciSayisi){
        int toplam = 0;
        for(int i = 0; i < OgrenciSayisi; i++){
            toplam += notlar[i];
        }

        double ortalama = (double) toplam / OgrenciSayisi;
        return ortalama;
    }

    public static int enYuksekNotuBul(int[] notlar, int OgrenciSayisi){
        int max = notlar[0];
        for(int i = 1; i < OgrenciSayisi; i++){
            if(notlar[i] > max){
                max = notlar[i];
            }
        }

        return max;
    }

    public static int enDusukNotuBul(int[] notlar, int OgrenciSayisi){
        int min = notlar[0];
        for(int i = 1; i < OgrenciSayisi; i++){
            if(notlar[i] < min){
                min = notlar[i];
            }
        }

        return min;
    }

    public static void gectiKaldiDurumu(String[] isimler, int[] notlar, int OgrenciSayisi){

        for(int i = 0; i < OgrenciSayisi; i++){
            if(notlar[i] >= 50){
                System.out.println(isimler[i] + ": " + notlar[i] + " - gecti" );
            }
            else{
                System.out.println(isimler[i] + ": " + notlar[i] + " - kaldi" );
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ogrenci sayisi girin: ");
        int OgrenciSayisi = input.nextInt();
        input.nextLine();
        String[] isimler = new String[OgrenciSayisi];
        int[] notlar = new int[OgrenciSayisi];


        // isimleri alıp listeye koyduk
        System.out.println("isimleri girin: ");
        for(int i=0 ; i < OgrenciSayisi ; i++){
            System.out.print((i+1) + ". Ogrencinin ismi:");
            String isim = input.nextLine();
            isimler[i] = isim;
        }


        // notları alıp listeye koyduk
        System.out.println("notlari girin: ");
        for(int i=0 ; i< OgrenciSayisi ; i++){
            while (true){
                System.out.print(isimler[i] + " adli ogrencinin notu: ");
                int not = input.nextInt();
                if(not >= 0 && not <= 100){
                    notlar[i] = not;
                    break;
                }
                else{
                    System.out.println("Girdiginiz not 0-100 arasinda olmali!");
                }
            }
        }
        notlariYazdir(isimler, notlar, OgrenciSayisi);
        System.out.println("Sinif Ortalamasi: " + ortalamaHesapla(notlar, OgrenciSayisi));
        System.out.println("En Yuksek Not: " + enYuksekNotuBul(notlar, OgrenciSayisi));
        System.out.println("En Dusuk Not: " + enDusukNotuBul(notlar, OgrenciSayisi));
        gectiKaldiDurumu(isimler, notlar, OgrenciSayisi);
        input.close();
    }
}
