package hellojpa;

import jakarta.persistence.*;

@Entity
//@Inheritance(strategy = InheritanceType.JOINED) //조인 테이블 전략
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // 단일 테이블 전략(기본값)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) //구현 클래스마다 테이블 전략, 해당 클래스를 추상화(abstract)로 만들어야 한다 !!
@DiscriminatorColumn //DTYPE 컬럼 자동 생성, 단일 테이블 전략 시 생략해도 자동 생성된다 !
public abstract class Item {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private int price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
