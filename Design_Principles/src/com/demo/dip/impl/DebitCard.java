package com.demo.dip.impl;

import com.demo.dip.BankCard;

public class DebitCard implements BankCard{

    public void doTransaction(long amount){
        System.out.println("payment using Debit card");
    }
}
