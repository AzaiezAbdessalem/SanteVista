package com.SanteVista.SanteVista.service.Impl;

import com.SanteVista.SanteVista.domain.Analyse;
import com.SanteVista.SanteVista.repository.AnalyseRepository;
import com.SanteVista.SanteVista.service.IAnalyseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class AnalyseImp implements IAnalyseService {
    private final AnalyseRepository analyseRepository;

    @Override
    public List<Analyse> findAll() {
        return analyseRepository.findAll();
    }

    @Override
    public Optional<Analyse> findById(Long id) {
        return analyseRepository.findById(id);
    }

    @Override
    public Analyse save(Analyse analyse) {
        return analyseRepository.save(analyse);
    }

    @Override
    public Analyse update(Analyse analyse) {
        return analyseRepository.save(analyse);
    }

    @Override
    public void deleteById(Long id) {
        analyseRepository.deleteById(id);
    }
}
