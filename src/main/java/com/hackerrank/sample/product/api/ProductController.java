package com.hackerrank.sample.product.api;

import com.hackerrank.sample.product.application.dto.ProductDto;
import com.hackerrank.sample.product.application.service.ProductApplicationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductApplicationService productService;

    public ProductController(ProductApplicationService productService) {
        this.productService = productService;
    }

    // ==========================
    // GET product details by ID
    // ==========================
    @GetMapping("/{id}")
    public ProductDto getProduct(@PathVariable Long id) {
        return productService.getProductDetails(id);
    }

}