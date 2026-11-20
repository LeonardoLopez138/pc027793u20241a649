package com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.embeddeble;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class SupplyBatchPersistenceConvert {

    @Column(name = "quantity", nullable = false)
    private Integer quantity;


    @Column(name = "unit", nullable = false)
    private String unit;

    public SupplyBatchPersistenceConvert(Integer quantity,String unit) {
        this.quantity = quantity;
        this.unit = unit;

    }
}
