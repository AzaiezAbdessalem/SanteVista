package com.SanteVista.SanteVista.service.Impl;

import com.SanteVista.SanteVista.domain.Regime;
import com.SanteVista.SanteVista.repository.RegimeRepository;
import com.SanteVista.SanteVista.service.IRegimeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class RegimeImp implements IRegimeService {
    private final RegimeRepository regimeRepository;
    @Override
    public List<Regime> findAll() {
        return regimeRepository.findAll();
    }

    @Override
    public Optional<Regime> findById(Long id) {
        return regimeRepository.findById(id);
    }

    @Override
    public Regime save(Regime regime) {
        return regimeRepository.save(regime);
    }

    @Override
    public Regime update(Regime regime) {
        return regimeRepository.save(regime);
    }

    @Override
    public void deleteById(Long id) {
regimeRepository.findById(id);
    }
}
