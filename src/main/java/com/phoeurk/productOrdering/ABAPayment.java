package com.phoeurk.productOrdering;

public class ABAPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount){
        System.out.println("Paid " + amount + "$ via ABA");
    }
}
