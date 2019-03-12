package com.accolite.multithreadingbug.supermarket;

import java.util.ArrayList;
import java.util.List;

public class Market {

    public static Float handleMarket(Float initialMoney) {

        Inventory inventory = new Inventory();
        inventory.addItem("orange", 20.00F, 10);
        inventory.addItem("apple", 50.00F, 5);
        inventory.addItem("ladyfinger", 10.00F, 20);
        inventory.addItem("cauliflower", 15.00F, 8);

        Wallet wallet = new Wallet(initialMoney);

        List<String> purchaseItems = new ArrayList<>();
        purchaseItems.add("orange");
        purchaseItems.add("cauliflower");
        purchaseItems.add("orange");
        purchaseItems.add("cauliflower");
        purchaseItems.add("orange");
        purchaseItems.add("cauliflower");

        Thread t1 = new Purchase(purchaseItems, inventory, wallet);

        List<String> sellItems = new ArrayList<>();
        sellItems.add("apple");
        sellItems.add("ladyfinger");
        sellItems.add("apple");
        sellItems.add("ladyfinger");
        sellItems.add("apple");
        sellItems.add("ladyfinger");
        sellItems.add("apple");
        sellItems.add("ladyfinger");

        Thread t2 = new Sell(sellItems, inventory, wallet);

        t1.start();
        t2.start();

        /*try {
            t1.join();
            t2.join();
        }
        catch(Exception ex) {

        }*/
        return wallet.getMoney();
    }

}
