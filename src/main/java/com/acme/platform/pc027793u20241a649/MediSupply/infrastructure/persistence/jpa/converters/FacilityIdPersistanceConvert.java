package com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.converters;

import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.FacilityId;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.UUID;

@Converter(autoApply = false)
public class FacilityIdPersistanceConvert implements AttributeConverter<FacilityId, UUID> {

    //convert the data to database in mysql
    @Override
    public UUID convertToDatabaseColumn(FacilityId attribute) {
        return attribute == null ? null : attribute.value();
    }


    @Override
    public FacilityId convertToEntityAttribute(UUID dbData) {
        return dbData == null ? null : new FacilityId(dbData);
    }
}
