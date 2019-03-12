package com.accolite.multithreadingbug.config;

import com.accolite.multithreadingbug.supermarket.Market;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println(Market.handleMarket(100.00F));
    }
}
