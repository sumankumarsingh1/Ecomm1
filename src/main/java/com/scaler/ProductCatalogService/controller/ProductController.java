package com.scaler.ProductCatalogService.controller;

import com.scaler.ProductCatalogService.dto.CategoryDTO;
import com.scaler.ProductCatalogService.dto.ProductDTO;
import com.scaler.ProductCatalogService.models.Product;
import com.scaler.ProductCatalogService.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProductService productService;
    @GetMapping()
    public List<ProductDTO> getProducts(){
        return new ArrayList<ProductDTO>();
    }

    @GetMapping("{id}")
    public ProductDTO getProduct(@PathVariable("id") Long productId){
        Product product = productService.getProductById(productId);
        return from(product);
    }

    private ProductDTO from(Product product){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());
        productDTO.setImageUrl(product.getImageUrl());
        if(product.getCategory()!=null){
            CategoryDTO categoryDTO=new CategoryDTO();
            categoryDTO.setId(product.getCategory().getId());
            categoryDTO.setName(product.getCategory().getName());
            categoryDTO.setDescription(product.getCategory().getDescription());
            productDTO.setCategory(categoryDTO);
        }
        return productDTO;
    }

    @PostMapping
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO){
        return productDTO;
    }

    @PutMapping("{id}")
    public ProductDTO replaceProduct(@PathVariable("id") Long productId, @RequestBody ProductDTO productDTO){
        return productDTO;
    }

}
