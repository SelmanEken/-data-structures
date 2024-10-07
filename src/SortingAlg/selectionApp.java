package SortingAlg;

public class selectionApp {
    public static void main(String[] args) {
        selection dizi = new selection(10);

        dizi.insert(77);
        dizi.insert(66);
        dizi.insert(22);
        dizi.insert(55);
        dizi.insert(11);
        dizi.insert(44);
        dizi.insert(88);
        dizi.insert(99);
        dizi.insert(33);
        dizi.insert(21);

        dizi.display();

        dizi.selectionsort();

        System.out.println("CLASS Uygulaması");
        dizi.display();
    }
}
