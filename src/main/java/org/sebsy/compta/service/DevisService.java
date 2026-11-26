package org.sebsy.compta.service;

import org.sebsy.compta.devis.Devis;
import org.sebsy.compta.devis.Remise;
import org.sebsy.compta.devis.RemiseVolume;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DevisService {

   // private final Remise remise;
    private final RemiseVolume remiseVolume;

    public DevisService(RemiseVolume remiseVolume) {
        this.remiseVolume = remiseVolume;
    }

    public Devis calculer(BigDecimal prixHt, int quantite) {
        return Devis.calculer(prixHt, quantite, remiseVolume);
    }
}
