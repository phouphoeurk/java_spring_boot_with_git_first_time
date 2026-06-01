package com.phoeurk.productOrdering;

public class Bank{
    private double balance;

    //getter
    public double getBalance(){return this.balance;}

    public void desposit(double amount) throws IllegalAccessException {
        if(amount > 0){
            this.balance += amount;
        }else {
            throw new IllegalAccessException("The amount must be positive");
        }
    }
}
