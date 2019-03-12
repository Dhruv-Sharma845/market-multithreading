package com.accolite.multithreadingbug.supermarket;

public class Wallet {

    private Float money;

    public Wallet(Float money) {
        this.money = money;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    //public synchronized  void addMoney(Float money) {
    public void addMoney(Float money) {
        this.setMoney(this.getMoney() + money);
    }

    //public synchronized void deductMoney(Float money) {
    public void deductMoney(Float money) {
        this.setMoney(this.getMoney() - money);
    }
}
