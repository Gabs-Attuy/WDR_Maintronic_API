package com.wdrmaintronic.service;

import com.wdrmaintronic.dto.request.RegisterSupplierRequest;
import com.wdrmaintronic.model.Supplier;
import com.wdrmaintronic.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {

    @Autowired
    SupplierRepository supplierRepository;

    public ResponseEntity<Supplier> registerSupplier(RegisterSupplierRequest request) {

        try{
            Supplier supplier = new Supplier();
            supplier.setCompanyName(request.getCompanyName());
            supplier.setCnpj(request.getCnpj());
            supplierRepository.save(supplier);
            return new ResponseEntity<>(supplier, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

}
