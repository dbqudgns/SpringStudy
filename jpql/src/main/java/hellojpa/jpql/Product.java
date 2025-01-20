package hellojpa.jpql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id @GeneratedValue
    @Column(name = "product_id")
    private Long id;
    private String name;
    private int price;
    private int stockAmount;

}
