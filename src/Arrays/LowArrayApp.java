package Arrays;

//import java.awt.desktop.SystemEventListener;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray dizi;
        dizi = new LowArray(100);
        int elemaSayisi = 0;
        int j;

        dizi.setElem(0, 77);
        dizi.setElem(1, 99);
        dizi.setElem(2, 44);
        dizi.setElem(3, 55);
        dizi.setElem(4, 22);
        dizi.setElem(5, 88);
        dizi.setElem(6, 11);
        dizi.setElem(7, 81);
        dizi.setElem(8, 66);
        dizi.setElem(9, 33);
        elemaSayisi = 10;
        //........
        for (j = 0; j < elemaSayisi; j++)
            System.out.print(dizi.getElem(j) + " ");
        System.out.println("");

        //...............arama

        int searchKey = 26;
        for (j = 0; j < elemaSayisi; j++)
            if (dizi.getElem(j) == searchKey)
                break;
        if (j == elemaSayisi)
            System.out.println("Bulunamadı " + searchKey);
        else
            System.out.println("Bulundu " + searchKey);
        //...............sil
        for (j = 0; j < elemaSayisi; j++)
            if (dizi.getElem(j) == 55)
                break;
        for (int k = j; k < elemaSayisi; k++)
            dizi.setElem(k, dizi.getElem(k + 1));
        elemaSayisi--;
        //...............Listele
        for (j = 0; j < elemaSayisi; j++)
            System.out.print(dizi.getElem(j) + " ");
        System.out.println("");

    }

}
