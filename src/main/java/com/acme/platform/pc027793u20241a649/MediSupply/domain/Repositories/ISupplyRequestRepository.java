package com.acme.platform.pc027793u20241a649.MediSupply.domain.Repositories;

import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.aggregates.SupplyRequest;

import java.util.List;
import java.util.Optional;

public interface ISupplyRequestRepository {
    Optional<SupplyRequest> findById(Long id);

    List<SupplyRequest> findAll();

    Optional<SupplyRequest> findByTitle(String title);

    SupplyRequest save(SupplyRequest supplyRequest);

    boolean existsById(Long id);

    boolean existsByTitle(String title);

    boolean existsByTitleAndIdIsNot(String title, Long id);

    void deleteById(Long id);
}
