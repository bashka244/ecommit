package com.oncode.ecoment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class OrderDetail {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderDetailId;

    @OneToOne @JsonIgnore
    private Product product;

    private int quantity;

}
