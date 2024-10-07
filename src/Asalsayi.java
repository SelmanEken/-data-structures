import java.util.Scanner;
class Asalsayi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayac;
        int toplam=0;
        System.out.println("Bir tam sayi giriniz: ");
        int sayi;
        sayi = scan.nextInt();

        while(sayi >= 2) {

            sayac = 0;
            for(int i = 2; i < sayi; i++)
            {
                if(sayi % i == 0) {
                    sayac++;
                }
            }
            if(sayac == 0) {
                System.out.println(sayi + " asal sayidir.");
                toplam++;
            }
            sayi--;

        }
        System.out.println(toplam +" sayı asaldir");
    }
}
