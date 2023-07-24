package com.oncode.ecoment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Order {

   @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
   private Long orderId;

   @OneToOne @JsonIgnore
   private Customer customer;

   @OneToMany @JsonIgnore
   private List<OrderDetail> orderDetails;

   private Date createdDate;

   @Enumerated(value = EnumType.ORDINAL)
   private OrderStatus orderStatus;

}
