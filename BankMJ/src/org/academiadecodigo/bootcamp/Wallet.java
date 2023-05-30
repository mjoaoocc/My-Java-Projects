package org.academiadecodigo.bootcamp;

public class Wallet {
    private int balance;

    public Wallet(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }
    public int deposit(int x){
        return balance = x + balance;
    }

}
