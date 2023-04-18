package com.microserviceexample.ProductService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponse {
    private String id = "";
    private String name = "";
    private String detail = "";
    private BigDecimal price = BigDecimal.ZERO;

}