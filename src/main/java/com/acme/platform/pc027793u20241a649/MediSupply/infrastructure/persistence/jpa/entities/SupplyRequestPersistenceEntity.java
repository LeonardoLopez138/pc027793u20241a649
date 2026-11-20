package com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.entities;

import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.FacilityId;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.SupplyRequestStatus;
import com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.converters.FacilityIdPersistanceConvert;
import com.acme.platform.pc027793u20241a649.shared.infrastructure.persistence.jpa.entities.AuditableAbstractPersistenceEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "supply_requests", uniqueConstraints = @UniqueConstraint(columnNames = "request_code"))
@Getter
@Setter
@NoArgsConstructor
public class SupplyRequestPersistenceEntity extends AuditableAbstractPersistenceEntity {

    @Column(name = "request_code", nullable = false, unique = true)
    private String requestCode;

    @Convert(converter = FacilityIdPersistanceConvert.class)
    @Column(name = "facility_id", nullable = false)
    private FacilityId facilityId;

    @Column(name = "fulfillment_start_date", nullable = false)
    private LocalDate fulfillmentStartDate;

    @Column(name = "fulfillment_end_date", nullable = false)
    private LocalDate fulfillmentEndDate;

    @Column(name = "batch_quantity", nullable = false)
    private Integer batchQuantity;

    @Column(name = "batch_unit", nullable = false)
    private String batchUnit;

    @Column(name = "urgency_level", nullable = false)
    private Integer urgencyLevel;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SupplyRequestStatus status;
}
