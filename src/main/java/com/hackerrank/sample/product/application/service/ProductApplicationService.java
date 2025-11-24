package com.hackerrank.sample.product.application.service;

import com.hackerrank.sample.product.application.dto.ProductDto;
import com.hackerrank.sample.product.application.mapper.ProductDtoMapper;
import com.hackerrank.sample.product.domain.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductApplicationService {

    private final ProductRepository productRepository;
    private final ProductDtoMapper dtoMapper;

    public ProductApplicationService(ProductRepository productRepository,
                                     ProductDtoMapper dtoMapper) {
        this.productRepository = productRepository;
        this.dtoMapper = dtoMapper;
    }

    public ProductDto getProductDetails(Long id) {
        var product = productRepository.findById(id);
        return dtoMapper.toDto(product);
    }
}