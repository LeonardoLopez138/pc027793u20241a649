package com.acme.platform.pc027793u20241a649.MediSupply.domain.model.aggregates;

import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.FacilityId;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.FulfillmentPeriod;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.RequestCode;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.SupplyBatch;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.SupplyRequestStatus;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.UrgencyLevel;
import com.acme.platform.pc027793u20241a649.shared.domain.model.aggregates.AbstractDomainAggregateRoot;
import lombok.Getter;

import java.util.Objects;

@Getter
public class SupplyRequest extends AbstractDomainAggregateRoot<SupplyRequest> {
    private Long id;
    private RequestCode requestCode;
    private FacilityId facilityId;
    private FulfillmentPeriod fulfillmentPeriod;
    private SupplyBatch supplyBatch;
    private UrgencyLevel urgencyLevel;
    private SupplyRequestStatus status;

    protected SupplyRequest() {
    }

    public SupplyRequest(
            RequestCode requestCode,
            FacilityId facilityId,
            FulfillmentPeriod fulfillmentPeriod,
            SupplyBatch supplyBatch,
            UrgencyLevel urgencyLevel,
            SupplyRequestStatus status) {
        this.requestCode = Objects.requireNonNull(requestCode, "requestCode is required");
        this.facilityId = Objects.requireNonNull(facilityId, "facilityId is required");
        this.fulfillmentPeriod = Objects.requireNonNull(fulfillmentPeriod, "fulfillmentPeriod is required");
        this.supplyBatch = Objects.requireNonNull(supplyBatch, "supplyBatch is required");
        this.urgencyLevel = Objects.requireNonNull(urgencyLevel, "urgencyLevel is required");
        this.status = Objects.requireNonNull(status, "status is required");
    }

    public SupplyRequest(
            RequestCode requestCode,
            FacilityId facilityId,
            FulfillmentPeriod fulfillmentPeriod,
            SupplyBatch supplyBatch,
            UrgencyLevel urgencyLevel) {
        this(requestCode, facilityId, fulfillmentPeriod, supplyBatch, urgencyLevel, SupplyRequestStatus.PENDING);
    }

    public static SupplyRequest reconstitute(
            Long id,
            RequestCode requestCode,
            FacilityId facilityId,
            FulfillmentPeriod fulfillmentPeriod,
            SupplyBatch supplyBatch,
            UrgencyLevel urgencyLevel,
            SupplyRequestStatus status) {
        var supplyRequest = new SupplyRequest(
                requestCode, facilityId, fulfillmentPeriod, supplyBatch, urgencyLevel, status);
        supplyRequest.id = id;
        return supplyRequest;
    }
}
