package SortingAlg;

public class selectionSortApp {
    public static void main(String[] args) {
        long temp;
        long[] dizi = new long[100];
        int elemanSayisi = 10;
        int min;

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
        System.out.println();

        for (int i = 0;i<elemanSayisi-1;i++){
            min = i;
            for (int j = i+1; j<elemanSayisi; j++)
                if (dizi[j]<dizi[min])
                    min = j;
            temp = dizi[min];
            dizi[min] = dizi[i];
            dizi[i] = temp;
        }


        for (int i = 0; i < elemanSayisi; i++)
            System.out.print(dizi[i] + " ");
        System.out.println();
    }
}
