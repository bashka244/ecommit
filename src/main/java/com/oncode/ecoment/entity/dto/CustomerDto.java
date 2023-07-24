package com.oncode.ecoment.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class CustomerDto {

    private String customerName;
    private  String adress;

}
