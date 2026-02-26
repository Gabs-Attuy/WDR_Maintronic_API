package com.wdrmaintronic.controller;

import com.wdrmaintronic.dto.request.CreateProductRequest;
import com.wdrmaintronic.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/register")
    public ResponseEntity<Void> register(
            @RequestBody @Valid CreateProductRequest request
    ) {
        productService.register(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
