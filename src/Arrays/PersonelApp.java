package Arrays;

public class PersonelApp {
    public static void main(String[] args) {
        int maxSize = 100;
        PersonelHareket dizi = new PersonelHareket(maxSize);

        dizi.insert("Ali", "Güven", 24);
        dizi.insert("Semih", "Liman", 37);
        dizi.insert("Ahmet", "Tam", 43);
        dizi.insert("Mert", "Ocak", 55);
        dizi.insert("Mehmet", "Aydın", 18);
        dizi.insert("Bilal", "Kasap", 21);
        dizi.insert("Kadir", "Liman", 55);
        dizi.display();

        String search = "Kasap";
        Personel found = dizi.find(search);
        if (found != null) {
            System.out.print(search+ " Bulundu");
            found.displayPersonel();
        } else
            System.out.println(search + " Bulunamadı...");

        System.out.println("Ocak,Tozlu ve Kuş siliniyor...");
        dizi.delete("Ocak");
        dizi.delete("Liman");
        dizi.delete("Tam");
        dizi.display();

    }
}
