package com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.converters;

import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.UrgencyLevel;
import jakarta.persistence.AttributeConverter;


public class UrgencyLevelPersistenceConvert implements AttributeConverter<UrgencyLevel, Integer> {

    @Override
    public Integer convertToDatabaseColumn(UrgencyLevel attribute) {
        return attribute == null ? null : attribute.value();
    }

    @Override
    public UrgencyLevel convertToEntityAttribute(Integer dbData) {
        return dbData == null ? null : new UrgencyLevel(dbData);
    }
}
