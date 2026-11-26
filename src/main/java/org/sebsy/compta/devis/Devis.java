package org.sebsy.compta.devis;

import java.math.BigDecimal;
import java.math.RoundingMode;

public record Devis(int quantite, BigDecimal ht, BigDecimal ttc) {

    private static final BigDecimal COEFFICIENT_TTC = new BigDecimal("1.20");

    public static Devis calculer(
            BigDecimal prixUnitaireHt,
            int quantite,
            RemiseVolume remiseVolume
    ) {
        BigDecimal montantBrut = prixUnitaireHt.multiply(BigDecimal.valueOf(quantite));
        BigDecimal montantApresRemise = montantBrut.multiply(
                BigDecimal.ONE.subtract(remiseVolume.taux(quantite))
        );

        BigDecimal ht = montantApresRemise.setScale(2, RoundingMode.HALF_UP);
        BigDecimal ttc = ht.multiply(COEFFICIENT_TTC)
                .setScale(2, RoundingMode.HALF_UP);

        return new Devis(quantite, ht, ttc);
    }
}