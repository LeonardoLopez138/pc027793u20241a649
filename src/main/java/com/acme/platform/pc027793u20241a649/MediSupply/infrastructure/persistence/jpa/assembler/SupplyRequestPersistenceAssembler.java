package com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.assembler;

import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.aggregates.SupplyRequest;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.FulfillmentPeriod;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.RequestCode;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.SupplyBatch;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.UrgencyLevel;
import com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.entities.SupplyRequestPersistenceEntity;

public final class SupplyRequestPersistenceAssembler {

    private SupplyRequestPersistenceAssembler() {
    }

    public static SupplyRequest toDomainFromPersistence(SupplyRequestPersistenceEntity entity) {
        if (entity == null) return null;

        return SupplyRequest.reconstitute(
                entity.getId(),
                new RequestCode(entity.getRequestCode()),
                entity.getFacilityId(),
                new FulfillmentPeriod(entity.getFulfillmentStartDate(), entity.getFulfillmentEndDate()),
                new SupplyBatch(entity.getBatchQuantity(), entity.getBatchUnit()),
                new UrgencyLevel(entity.getUrgencyLevel()),
                entity.getStatus());
    }

    public static SupplyRequestPersistenceEntity toPersistenceFromDomain(SupplyRequest supplyRequest) {
        if (supplyRequest == null) return null;

        var entity = new SupplyRequestPersistenceEntity();
        if (supplyRequest.getId() != null) {
            entity.setId(supplyRequest.getId());
        }
        entity.setRequestCode(supplyRequest.getRequestCode().code());
        entity.setFacilityId(supplyRequest.getFacilityId());
        entity.setFulfillmentStartDate(supplyRequest.getFulfillmentPeriod().startDate());
        entity.setFulfillmentEndDate(supplyRequest.getFulfillmentPeriod().endDate());
        entity.setBatchQuantity(supplyRequest.getSupplyBatch().quantity());
        entity.setBatchUnit(supplyRequest.getSupplyBatch().unit());
        entity.setUrgencyLevel(supplyRequest.getUrgencyLevel().value());
        entity.setStatus(supplyRequest.getStatus());
        return entity;
    }
}
