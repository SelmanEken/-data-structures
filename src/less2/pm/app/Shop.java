package less2.pm.app;

import less2.pm.data.Product;

import java.math.BigDecimal;

public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Kalem");
        p1.setPrice(BigDecimal.valueOf(1.99));

        Product p2 = new Product(2, "Defter", BigDecimal.valueOf(2.99));

        System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice());
        System.out.println(p2.getId() + " " + p2.getName() + " " + p2.getPrice());


    }
}
