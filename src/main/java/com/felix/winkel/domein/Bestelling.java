package com.felix.winkel.domein;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Bestelling {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private LocalDateTime besteldOp;
    private boolean afgeleverd;
    private String bezorger;

    @ManyToOne
    private Product product;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getBesteldOp() {
        return besteldOp;
    }

    public void setBesteldOp(LocalDateTime besteldOp) {
        this.besteldOp = besteldOp;
    }

    public boolean isAfgeleverd() {
        return afgeleverd;
    }

    public void setAfgeleverd(boolean afgeleverd) {
        this.afgeleverd = afgeleverd;
    }

    public String getBezorger() {
        return bezorger;
    }

    public void setBezorger(String bezorger) {
        this.bezorger = bezorger;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
