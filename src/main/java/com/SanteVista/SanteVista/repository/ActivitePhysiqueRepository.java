package com.SanteVista.SanteVista.repository;

import com.SanteVista.SanteVista.domain.ActivitePhysique;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ActivitePhysiqueRepository extends JpaRepository<ActivitePhysique, Long> {

}
