package com.accolite.multithreadingbug.supermarket;

import java.util.List;

public class Purchase extends Thread{

    private List<String> items;
    private Inventory inventory;
    private Wallet wallet;

    public Purchase(List<String> items, Inventory inventory, Wallet wallet) {
        this.items = items;
        this.inventory = inventory;
        this.wallet = wallet;
    }

    public void run() {

        for(String item : items) {
            this.wallet.deductMoney(inventory.getPriceOfItem(item));
        }

    }


}
