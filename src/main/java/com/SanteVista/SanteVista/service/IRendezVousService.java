package com.SanteVista.SanteVista.service;

import com.SanteVista.SanteVista.domain.RendezVous;

import java.util.List;
import java.util.Optional;

public interface IRendezVousService {
    List<RendezVous> findAll();
    Optional<RendezVous> findById(Long id);
    RendezVous save(RendezVous rendezVous);
    RendezVous update(RendezVous rendezVous);
    void deleteById(Long id);
}
