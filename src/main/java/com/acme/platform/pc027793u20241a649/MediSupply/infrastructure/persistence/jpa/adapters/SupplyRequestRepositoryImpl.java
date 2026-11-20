package com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.adapters;

import com.acme.platform.pc027793u20241a649.MediSupply.domain.Repositories.ISupplyRequestRepository;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.aggregates.SupplyRequest;
import com.acme.platform.pc027793u20241a649.MediSupply.domain.model.valueobjects.RequestCode;
import com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.assembler.SupplyRequestPersistenceAssembler;
import com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.repositories.ISupplyRequestPersistenceRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SupplyRequestRepositoryImpl implements ISupplyRequestRepository {

    private final ISupplyRequestPersistenceRepository persistenceRepository;

    public SupplyRequestRepositoryImpl(ISupplyRequestPersistenceRepository persistenceRepository) {
        this.persistenceRepository = persistenceRepository;
    }

    @Override
    public Optional<SupplyRequest> findById(Long id) {
        return persistenceRepository.findById(id).map(SupplyRequestPersistenceAssembler::toDomainFromPersistence);
    }

    @Override
    public List<SupplyRequest> findAll() {
        return persistenceRepository.findAll().stream()
                .map(SupplyRequestPersistenceAssembler::toDomainFromPersistence)
                .toList();
    }

    @Override
    public Optional<SupplyRequest> findByRequestCode(RequestCode requestCode) {
        return persistenceRepository.findByRequestCode(requestCode.code())
                .map(SupplyRequestPersistenceAssembler::toDomainFromPersistence);
    }

    @Override
    public SupplyRequest save(SupplyRequest supplyRequest) {
        var entity = SupplyRequestPersistenceAssembler.toPersistenceFromDomain(supplyRequest);
        var saved = persistenceRepository.save(entity);
        return SupplyRequestPersistenceAssembler.toDomainFromPersistence(saved);
    }

    @Override
    public boolean existsById(Long id) {
        return persistenceRepository.existsById(id);
    }

    @Override
    public boolean existsByRequestCode(RequestCode requestCode) {
        return persistenceRepository.existsByRequestCode(requestCode.code());
    }

    @Override
    public boolean existsByRequestCodeAndIdIsNot(RequestCode requestCode, Long id) {
        return persistenceRepository.existsByRequestCodeAndIdIsNot(requestCode.code(), id);
    }

    @Override
    public void deleteById(Long id) {
        persistenceRepository.deleteById(id);
    }
}
