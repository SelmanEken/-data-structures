package Arrays;

public class Personel {
    private String Soyad;
    private String soyadi;
    private String adi;
    private int yasi;

    public Personel(String ad, String soyadi, int yas) {
        soyadi = Soyad;
        adi = ad;
        yasi = yas;
    }

    public void displayPersonel() {
        System.out.print("ad: " + adi);
        System.out.print(" Soyad: " + soyadi);
        System.out.print(" Yaş: " + yasi);
    }

    public String getSoyad() {
        return soyadi;
    }

}
