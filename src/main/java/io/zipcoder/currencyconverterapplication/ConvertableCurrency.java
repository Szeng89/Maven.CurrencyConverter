package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    Double convert(CurrencyType currencyType);

    CurrencyType getName();

}
