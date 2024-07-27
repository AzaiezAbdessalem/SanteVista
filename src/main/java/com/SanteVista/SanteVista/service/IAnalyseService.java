package com.SanteVista.SanteVista.service;

import com.SanteVista.SanteVista.domain.ActivitePhysique;
import com.SanteVista.SanteVista.domain.Analyse;

import java.util.List;
import java.util.Optional;

public interface IAnalyseService {
    List<Analyse> findAll();
    Optional<Analyse> findById(Long id);

    Analyse save(Analyse activitePhysique);

    Analyse update(Analyse activitePhysique);

    void deleteById(Long id);
}
