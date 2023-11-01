package com.bohdan.springboot;

public class Bank {
    private long id;
    private String bankName;
    private String stockExchangeSymbol;
    private String country;

    public Bank(long id, String bankName, String stockExchangeSymbol, String country) {
        this.id = id;
        this.bankName = bankName;
        this.stockExchangeSymbol = stockExchangeSymbol;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public String getBankName() {
        return bankName;
    }

    public String getStockExchangeSymbol() {
        return stockExchangeSymbol;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", bankName='" + bankName + '\'' +
                ", stockExchangeSymbol='" + stockExchangeSymbol + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
