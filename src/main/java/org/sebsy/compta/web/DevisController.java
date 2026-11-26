package org.sebsy.compta.web;

import java.math.BigDecimal;

import org.sebsy.compta.devis.Devis;
import org.sebsy.compta.service.DevisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/devis")
@RequiredArgsConstructor
public class DevisController {

    private final DevisService devisService;

    @GetMapping
    public Devis calculerDevis(@RequestParam BigDecimal prixHt, @RequestParam(defaultValue = "1") int quantite
    ) {
        return devisService.calculer(prixHt, quantite);
    }

    @GetMapping("/{quantite}")
    public Devis calculerDevisAvecQuantite(
            @PathVariable int quantite,
            @RequestParam BigDecimal prixHt
    ) {
        return devisService.calculer(prixHt, quantite);
    }
}
