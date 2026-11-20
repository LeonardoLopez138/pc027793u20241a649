package com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.converters;

import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.RequestCode;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class RequestCodePersistenceConvert implements AttributeConverter<RequestCode, String> {

    @Override
    public String convertToDatabaseColumn(RequestCode attribute) {
        return attribute == null ? null : attribute.code();
    }

    @Override
    public RequestCode convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new RequestCode(dbData);
    }
}
