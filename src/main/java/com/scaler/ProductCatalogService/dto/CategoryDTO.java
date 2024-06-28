package com.scaler.ProductCatalogService.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.scaler.ProductCatalogService.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryDTO {
    private Long id;
    private String name;
    private String description;
    private List<Product> productList;
}
