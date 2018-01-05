package com.parallel.shared;

public class Account{
    private Integer amount = 1000;

    public void increment(){
        amount+=2000;
    }
    public void decrement(){
        amount-=1000;
    }

    public Integer getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "amount=" + amount +
                '}';
    }
}