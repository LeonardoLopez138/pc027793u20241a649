package com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects;

public record SupplyBatch(Integer quantity, String unit) {
    public SupplyBatch {
        if (quantity == null || quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }
        if (unit == null || unit.isBlank()) {
            throw new IllegalArgumentException("Unit cannot be null or blank");
        }
    }

    public SupplyBatch addUnits(Integer additionalQuantity) {
        if (additionalQuantity == null || additionalQuantity <= 0) {
            throw new IllegalArgumentException("Additional quantity must be greater than zero");
        }
        if ((long) quantity + additionalQuantity > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Quantity exceeds the maximum allowed value");
        }
        return new SupplyBatch(quantity + additionalQuantity, unit);
    }
}
