package SortingAlg;

public class insertion {
    long temp;
    private long[] dizi;
    private int elemanSayisi;
    private int min;

    public insertion(int max) {
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

    public void insertionSort() {
        int j, i;
        for (i = 1; i < elemanSayisi; i++) {
            long temp = dizi[i];
            j = i;
            while (j > 0 && dizi[j - 1] >= temp) {
                dizi[j] = dizi[j - 1];
                --j;
            }
            dizi[j] = temp;
        }
    }
}
