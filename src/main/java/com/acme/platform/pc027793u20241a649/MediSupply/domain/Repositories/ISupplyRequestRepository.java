package com.acme.platform.pc027793u20241a649.MediSupply.domain.Repositories;

import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.aggregates.SupplyRequest;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.RequestCode;

import java.util.List;
import java.util.Optional;

public interface ISupplyRequestRepository {
    Optional<SupplyRequest> findById(Long id);

    List<SupplyRequest> findAll();

    Optional<SupplyRequest> findByRequestCode(RequestCode requestCode);

    SupplyRequest save(SupplyRequest supplyRequest);

    boolean existsById(Long id);

    boolean existsByRequestCode(RequestCode requestCode);

    boolean existsByRequestCodeAndIdIsNot(RequestCode requestCode, Long id);

    void deleteById(Long id);
}
