package com.wdrmaintronic.service;

import com.wdrmaintronic.dto.request.CreateProductRequest;
import com.wdrmaintronic.exception.BusinessException;
import com.wdrmaintronic.model.Product;
import com.wdrmaintronic.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional
    public void register(CreateProductRequest request) {

        if(productRepository.existsByName(request.name())) {
            throw new BusinessException("Produto já cadastrado!");
        }

        Product product = new Product();
        product.setName(request.name());
        BigDecimal price = request.unitPrice().setScale(2, RoundingMode.HALF_UP);
        product.setUnitPrice(price);
        product.setQuantityInStock(request.quantityInStock());
        product.setDescription(request.description());

        productRepository.save(product);
    }
}
