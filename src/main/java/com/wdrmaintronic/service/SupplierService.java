package com.wdrmaintronic.service;

import com.wdrmaintronic.dto.request.CreateSupplierRequest;
import com.wdrmaintronic.model.Supplier;
import com.wdrmaintronic.repository.SupplierRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SupplierService {

    private final SupplierRepository supplierRepository;

    @Transactional
    public void register(CreateSupplierRequest request) {

        if (supplierRepository.existsByCnpj(request.cnpj())) {
            throw new IllegalArgumentException("CNPJ já cadastrado");
        }

        Supplier supplier = new Supplier();
        supplier.setCompanyName(request.companyName());
        supplier.setCnpj(request.cnpj());

        supplierRepository.save(supplier);
    }
}
