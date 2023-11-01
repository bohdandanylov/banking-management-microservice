package com.bohdan.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BankController {
    @RequestMapping("/banks")
    public List<Bank> retrieveAllBanks(){
        return Arrays.asList(
                new Bank(0, "Industrial and Commercial Bank Of China Ltd.", "OTC", "China"),
                new Bank(1, "China Construction Bank Corp.", "OTC", "China"),
                new Bank(2, "JPMorgan Chase & Co.", "NYSE", "United States"),
                new Bank(3, "Bank of America Corp.", "NYSE", "United States"),
                new Bank(4, "Wells Fargo & Co.", "NYSE", "United States"),
                new Bank(5, "Citigroup Inc.", "NYSE", "United States"),
                new Bank(6, "BNP Paribas", "OTC", "France"),
                new Bank(7, "HSBC Holdings", "NYSE", "England"),
                new Bank(8, "Banco Santander", "NYSE", "Spain"),
                new Bank(9, "China Merchants Bank", "OTC", "China")
        );
    }
}
