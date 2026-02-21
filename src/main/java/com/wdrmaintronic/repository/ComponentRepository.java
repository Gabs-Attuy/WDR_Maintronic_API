package com.wdrmaintronic.repository;

import com.wdrmaintronic.model.Component;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ComponentRepository extends JpaRepository<Component, UUID> {
}
