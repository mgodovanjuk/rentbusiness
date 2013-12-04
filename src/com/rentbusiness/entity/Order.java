package com.rentbusiness.entity;

import javax.persistence.*;

/**
 * Created by Mykhailo_Hodovaniuk on 12/4/13.
 */
@Entity
@Table(name = "\"Order\"")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_id_seq_gen")
    @SequenceGenerator(name = "order_id_seq_gen", sequenceName = "order_id_seq")
    private Long id;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
