package com.acme.platform.pc027793u20241a649.MediSupply.application.commands;

import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.FacilityId;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.FulfillmentPeriod;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.RequestCode;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.SupplyBatch;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.SupplyRequestStatus;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.UrgencyLevel;

import java.util.Objects;

public record CreateSupplyRequestCommand(
        RequestCode requestCode,
        FacilityId facilityId,
        FulfillmentPeriod fulfillmentPeriod,
        SupplyBatch supplyBatch,
        UrgencyLevel urgencyLevel,
        SupplyRequestStatus status) {

    public CreateSupplyRequestCommand {
        Objects.requireNonNull(requestCode, "requestCode is required");
        Objects.requireNonNull(facilityId, "facilityId is required");
        Objects.requireNonNull(fulfillmentPeriod, "fulfillmentPeriod is required");
        Objects.requireNonNull(supplyBatch, "supplyBatch is required");
        Objects.requireNonNull(urgencyLevel, "urgencyLevel is required");
        Objects.requireNonNull(status, "status is required");
    }
}
