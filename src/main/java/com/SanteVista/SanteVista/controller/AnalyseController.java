package com.SanteVista.SanteVista.controller;

import com.SanteVista.SanteVista.domain.ActivitePhysique;
import com.SanteVista.SanteVista.domain.Analyse;
import com.SanteVista.SanteVista.service.IAnalyseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/SanteVista/analyse")
@RequiredArgsConstructor
@Slf4j
public class AnalyseController {
    private final IAnalyseService analyseService;
    @GetMapping
    public ResponseEntity<List<Analyse>> getAllAnalyses() {
        List<Analyse> analyses = analyseService.findAll();
        return new ResponseEntity<>(analyses, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Analyse> getAnalyseById(@PathVariable Long id) {
        return analyseService.findById(id)
                .map(analyse -> new ResponseEntity<>(analyse, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Analyse> createAnalyse(@RequestBody Analyse analyse) {
        Analyse savedAnalyse = analyseService.save(analyse);
        return new ResponseEntity<>(savedAnalyse, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Analyse> updateAnalyse(@PathVariable Long id, @RequestBody Analyse analyse) {
        if (!analyseService.findById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        analyse.setId(id);
        Analyse updatedAnalyse = analyseService.update(analyse);
        return new ResponseEntity<>(updatedAnalyse, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnalyse(@PathVariable Long id) {
        if (!analyseService.findById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        analyseService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
