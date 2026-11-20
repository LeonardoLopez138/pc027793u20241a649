package com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.repositories;

import com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.entities.SupplyRequestPersistenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ISupplyRequestPersistenceRepository extends JpaRepository<SupplyRequestPersistenceEntity, Long> {
    Optional<SupplyRequestPersistenceEntity> findByRequestCode(String requestCode);

    boolean existsByRequestCode(String requestCode);

    boolean existsByRequestCodeAndIdIsNot(String requestCode, Long id);
}
