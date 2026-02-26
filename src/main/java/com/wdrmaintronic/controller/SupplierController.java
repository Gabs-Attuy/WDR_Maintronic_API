package com.wdrmaintronic.controller;

import com.wdrmaintronic.dto.request.CreateSupplierRequest;
import com.wdrmaintronic.service.SupplierService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/suppliers")
@RequiredArgsConstructor
public class SupplierController {

    private final SupplierService supplierService;

    @PostMapping("/register")
    public ResponseEntity<Void> register(
            @RequestBody @Valid CreateSupplierRequest request
    ) {
        supplierService.register(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}