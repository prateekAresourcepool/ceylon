package org.ceylonsmunich.service.entity.id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeRateId implements Serializable {
    private String fromCurrency;
    private String toCurrency;
}
