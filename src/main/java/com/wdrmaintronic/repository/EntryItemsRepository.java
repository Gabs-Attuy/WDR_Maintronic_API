package com.wdrmaintronic.repository;

import com.wdrmaintronic.model.EntryItems;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EntryItemsRepository extends JpaRepository<EntryItems, UUID> {
}
