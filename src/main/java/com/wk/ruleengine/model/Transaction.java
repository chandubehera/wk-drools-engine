package com.wk.ruleengine.model;

public class Transaction {
    private double amount;
    private boolean highValue;

    public Transaction(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isHighValue() {
        return highValue;
    }

    public void setHighValue(boolean highValue) {
        this.highValue = highValue;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", highValue=" + highValue +
                '}';
    }
}
