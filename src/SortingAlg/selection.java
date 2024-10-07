package SortingAlg;

public class selection {
    long temp;
    private long[] dizi;
    private int elemanSayisi;
    private int min;

    public selection(int max) {
        dizi = new long[max];
        elemanSayisi = 0;
    }

    public void insert(long value) {
        dizi[elemanSayisi] = value;
        elemanSayisi++;
    }

    public void display() {
        for (int i = 0; i < elemanSayisi; i++)
            System.out.print(dizi[i] + " ");
        System.out.println();
    }

    public void swap(int a, int b) {
        temp = dizi[a];
        dizi[a] = dizi[b];
        dizi[b] = temp;
    }

    public void selectionsort() {
        for (int i = 0; i < elemanSayisi - 1; i++) {
            min = i;
            for (int j = i + 1; j < elemanSayisi; j++)
                if (dizi[j] < dizi[min])
                    min = j;
            swap(min, i);
        }
    }
}
