package Arrays;

public class OrderedArray {
    private long[] dizi;
    private int elemanSayisi;

    public OrderedArray(int max) {
        dizi = new long[max];
        elemanSayisi = 0;
    }

    public int size() {

        return elemanSayisi;
    }

    public void insert(long value) {
        int j;
        for (j = 0; j < elemanSayisi; j++)
            if (dizi[j] > value)
                break;
        for (int k = elemanSayisi; k > j; k--)
            dizi[k] = dizi[k - 1];
        dizi[j] = value;
        elemanSayisi++;
    }

    public boolean delete(long value) {
        int j = find(value);//önce ara
        if (j == elemanSayisi)
            return false;
        else {//bulundu
            for (int k = j; k < elemanSayisi; k++)
                dizi[k] = dizi[k + 1];
            elemanSayisi--;
            return true;
        }
    }

    public int find(long searcKey) {
        int lowerBound = 0;
        int upperBound = elemanSayisi - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (dizi[curIn] == searcKey)
                return curIn;
            else if (lowerBound > upperBound)
                return elemanSayisi;
            else {
                if (dizi[curIn] < searcKey)
                    lowerBound = curIn + 1;
                else upperBound = curIn - 1;
            }//else
        }//while
    }//find

    public void display() {
        for (int j = 0; j < elemanSayisi; j++)
            System.out.print(dizi[j] + " ");
        System.out.println("");
    }
}
