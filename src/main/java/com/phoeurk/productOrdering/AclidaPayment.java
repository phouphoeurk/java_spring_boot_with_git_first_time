package com.phoeurk.productOrdering;

public class AclidaPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount){
        System.out.println("Paid " + amount + "$ vai ACLIDA");
    }
}
