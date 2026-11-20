package com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.repositories;

import com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.entities.SupplyRequestPersistenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ISupplyRequestPersistenceRepository extends JpaRepository<SupplyRequestPersistenceEntity, Long> {
    Optional<SupplyRequestPersistenceEntity> findByTitle(String code);

    boolean existsByRequestCode(String code);

    boolean existsByRequestCodeAndIdIsNot(String code, Long id);
}