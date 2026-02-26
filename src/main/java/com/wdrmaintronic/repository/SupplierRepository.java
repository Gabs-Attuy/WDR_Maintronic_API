package com.wdrmaintronic.repository;

import com.wdrmaintronic.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SupplierRepository extends JpaRepository<Supplier, UUID> {

    boolean existsByCnpj(String cnpj);

}
