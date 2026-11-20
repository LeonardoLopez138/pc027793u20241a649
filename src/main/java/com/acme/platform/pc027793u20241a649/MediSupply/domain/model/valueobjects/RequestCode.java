package com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects;

public record RequestCode(String code) {
    public RequestCode {
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("Request code cannot be null or blank");
        }
    }
}
