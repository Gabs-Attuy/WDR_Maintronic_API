package com.wdrmaintronic.repository;

import com.wdrmaintronic.model.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EntryRepository extends JpaRepository<Entry, UUID> {
}
