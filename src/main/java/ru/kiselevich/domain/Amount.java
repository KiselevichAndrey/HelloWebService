package ru.kiselevich.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Amount {
    // предоставляем фреймворку возможность генерации индентификаторов
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Long amount;

    public Amount() {
    }

    public Amount(Long amount) {
        this.amount = amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getAmount() {
        return amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
