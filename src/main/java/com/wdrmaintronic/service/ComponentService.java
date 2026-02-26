package com.wdrmaintronic.service;

import com.wdrmaintronic.dto.request.CreateComponentRequest;
import com.wdrmaintronic.exception.BusinessException;
import com.wdrmaintronic.model.Component;
import com.wdrmaintronic.repository.ComponentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
@RequiredArgsConstructor
public class ComponentService {

    private final ComponentRepository componentRepository;

    @Transactional
    public void register(CreateComponentRequest request) {

        if(componentRepository.existsByName(request.name())) {
            throw new BusinessException("Componente já cadastrado!");
        }

        Component component = new Component();
        component.setName(request.name());
        BigDecimal price = request.unitPrice().setScale(2, RoundingMode.HALF_UP);
        component.setUnitPrice(price);
        component.setQuantityInStock(request.quantityInStock());
        component.setDescription(request.description());

        componentRepository.save(component);
    }
}
