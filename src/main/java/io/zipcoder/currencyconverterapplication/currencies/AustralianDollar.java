package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / currencyType.AUSTRALIAN_DOLLAR.getRate();
    }

    @Override
    public CurrencyType getName() {
        return CurrencyType.AUSTRALIAN_DOLLAR;
    }
}
