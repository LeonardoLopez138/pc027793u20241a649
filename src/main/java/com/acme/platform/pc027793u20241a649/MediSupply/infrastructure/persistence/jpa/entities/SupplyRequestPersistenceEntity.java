package com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.entities;
import com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.converters.FacilityIdPersistanceConvert;
import com.acme.platform.pc027793u20241a649.shared.infrastructure.persistence.jpa.entities.AuditableAbstractPersistenceEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
public class SupplyRequestPersistenceEntity extends AuditableAbstractPersistenceEntity {

    @Convert(converter =  FacilityIdPersistanceConvert.class)
    @Column(name = "facility_id", nullable = false, unique = true)//unique se pone unicamente cuando no quieras que se repita algo en la base de datos
    private  FacilityIdPersistanceConvert  facilityIdPersistanceConvert;



}
