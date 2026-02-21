package com.wdrmaintronic.controller;

import com.wdrmaintronic.dto.request.RegisterSupplierRequest;
import com.wdrmaintronic.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    @PostMapping(path = "/register")
    public ResponseEntity<?> registerSupplier(RegisterSupplierRequest request) {
        return supplierService.registerSupplier(request);
    }

}