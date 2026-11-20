package com.acme.platform.pc027793u20241a649.MediSupply.application.commands;

public record DeleteSupplyRequestCommand(Long id) {

    public DeleteSupplyRequestCommand {
        if (id == null || id < 1) {
            throw new IllegalArgumentException("Supply request id cannot be null or less than 1");
        }
    }
}
