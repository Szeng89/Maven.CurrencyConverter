package io.zipcoder.currencyconverterapplication;

public abstract class AbstractClass implements ConvertableCurrency {

    String name;
    CurrencyType currencyType;

    public AbstractClass(String name) {
        this.name = name;
        this.currencyType = CurrencyType.getTypeOfCurrency(this);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Double convert(CurrencyType currencyType) {

        return currencyType.getRate() / this.currencyType.getRate(); //this represents the current currency object calling the method. which would be the sourceCurrencyType in currencyConverter

    }
}
