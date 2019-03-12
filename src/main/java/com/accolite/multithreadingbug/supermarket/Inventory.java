package com.accolite.multithreadingbug.supermarket;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<String, Float> pricePerItem;
    private Map<String, Integer> stockPerItem;

    public Inventory() {
        this.pricePerItem = new HashMap<>();
        this.stockPerItem = new HashMap<>();
    }

    public void addItem(String itemName, Float price, Integer stock) {
        this.pricePerItem.put(itemName, price);
        this.stockPerItem.put(itemName, stock);
    }

    public Float getPriceOfItem(String itemName) {
        return this.pricePerItem.get(itemName);
    }

    public Integer getStockPerItem(String itemName) {
        return this.stockPerItem.get(itemName);
    }
}
