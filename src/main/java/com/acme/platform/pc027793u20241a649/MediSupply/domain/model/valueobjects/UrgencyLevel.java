package com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects;

public record UrgencyLevel(Integer value) {
    public UrgencyLevel {
        if (value == null || value < 1 || value > 5) {
            throw new IllegalArgumentException("Urgency level must be between 1 and 5");
        }
    }
}
