package SortingAlg;

public class bubbleSortApp {
    public static void main(String[] args) {
        long temp;
        long[] dizi = new long[100];
        int elemanSayisi = 10;
        dizi[0] = 77;
        dizi[1] = 66;
        dizi[2] = 22;
        dizi[3] = 11;
        dizi[4] = 55;
        dizi[5] = 33;
        dizi[6] = 99;
        dizi[7] = 44;
        dizi[8] = 88;
        dizi[9] = 21;

        for (int i = 0; i < elemanSayisi; i++)
            System.out.print(dizi[i] + " ");
            System.out.println("");

        for (int i = 0; i < elemanSayisi - 1; i++)
            for (int j = 0; j < elemanSayisi - i - 1; j++)//Önce 9 karşılaştır
                if (dizi[j] > dizi[j + 1]) {
                    temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
        for (int i = 0; i < elemanSayisi; i++)
            System.out.print(dizi[i] + " ");

    }
}
