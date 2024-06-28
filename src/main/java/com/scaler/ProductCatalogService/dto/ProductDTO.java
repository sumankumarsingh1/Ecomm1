package com.scaler.ProductCatalogService.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.scaler.ProductCatalogService.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDTO {
    private Long id;
    private String name;
    private String imageUrl;
    private String description;
    private Double price;
    private CategoryDTO category;
}
