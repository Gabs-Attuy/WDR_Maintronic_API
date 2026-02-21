package com.wdrmaintronic.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Column(nullable = false)
    private Date entryDate;

    @Column(nullable = false)
    private BigDecimal totalAmount;

    private String observation;

    @ManyToOne
    @JoinColumn(name = "supplierId" )
    private Supplier supplierId;

}