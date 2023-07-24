package com.oncode.ecoment.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Setter @Getter
@AllArgsConstructor @NoArgsConstructor
public class OrderDto {

    private Long customerId;
    private List<Long> orderDetailId;

}
