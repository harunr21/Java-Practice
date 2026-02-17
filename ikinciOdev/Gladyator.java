package ikinciOdev;

public class Gladyator {
    private String isim;
    private int saglik;
    private int vurusGucu;

    // sınıfın constructor kısmı
    public Gladyator(String isim, int saglik, int vurusGucu) {
        this.isim = isim;
        setSaglik(saglik);
        this.vurusGucu = vurusGucu;
    }

    // isim için getter
    public String getIsim() {
        return isim;
    }

    // sağlık için getter ve setter 
    public int getSaglik() {
        return saglik;
    }
    public void setSaglik(int saglik) {
        if (saglik < 0) {
            this.saglik = 0;
        }
        else this.saglik = saglik; 
          
    }


    // aksiyon metodları
    public void saldir(Gladyator rakip) {
        int yeniSaglik = rakip.getSaglik() - vurusGucu;
        rakip.setSaglik(yeniSaglik);

        System.out.println(this.isim + ", " + rakip.getIsim() + " adli oyuncuya " + this.vurusGucu + " kadar vurdu!");
    }


    public boolean hayattaMi() {
        return this.saglik > 0;
    }
}
