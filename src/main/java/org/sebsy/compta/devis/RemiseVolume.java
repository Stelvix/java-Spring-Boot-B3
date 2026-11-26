package org.sebsy.compta.devis;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class RemiseVolume implements Remise {

    @Override
    public BigDecimal taux(int quantite) {
        if (quantite >= 10) {
            return new BigDecimal("0.05"); // 5% de remise pour 10 unités
        } else {
            return BigDecimal.ZERO; // Pas de remise pour moins de 10 unités
        }
    }
}
