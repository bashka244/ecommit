package com.oncode.ecoment.entity.dto;

import com.oncode.ecoment.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.security.DenyAll;


@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class OrderDetailDto {

    private Long productId;

    private int quantity;

}
