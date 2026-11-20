package com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects;

import java.util.UUID;

public record FacilityId(UUID value) {
    public FacilityId {
        if (value == null) {
            throw new IllegalArgumentException("Facility id cannot be null");
        }
    }
}
