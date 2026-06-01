package com.phoeurk.productOrdering;

public class OrderSystem{
    public void checkStock(int quantitiv) throws Exception{
        if(quantitiv <= 0){
            throw new Exception("Invalid Quantity!!");
        }
    }
}
