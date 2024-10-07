package Arrays;

public class OrderedApp {
    public static void main(String[] args) {
        int maxSize=100;
        OrderedArray dizi =new OrderedArray(maxSize);

        dizi.insert(77);
        dizi.insert(99);
        dizi.insert(44);
        dizi.insert(55);
        dizi.insert(22);
        dizi.insert(88);
        dizi.insert(11);
        dizi.insert(81);
        dizi.insert(66);
        dizi.insert(33);

        dizi.display();

        int searcKey=55;
        if (dizi.find(searcKey)!= dizi.size())
            System.out.println(searcKey+" Bulundu");
        else
            System.out.println(searcKey+" Bulunamadı");

        dizi.delete(81);
        dizi.delete(55);
        dizi.delete(99);
        dizi.display();
    }
}
