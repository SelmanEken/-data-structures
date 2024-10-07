package less2.pm.data;

import java.math.BigDecimal;

public class Product {
    private int id;
    private String name;
    private BigDecimal price;

    public Product() {
    }

    public Product(int id, String name, BigDecimal price) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public void setId(int id) {     //setter ve getter tanımlama
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
