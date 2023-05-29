package org.academiadecodigo.bootcamp;

public class Client {
    private String name;
    private Bank bankmj;
    private Wallet wallet;

    public Client(String name, Bank bankmj, Wallet wallet) {
        this.name = name;
        this.bankmj = bankmj;
        this.wallet = wallet;

    }

    public String getName() {
        return name;
    }

    public int deposit(int y){
        return wallet.deposit(y);
    }

    public int balance(){
        return wallet.getBalance();

    }



}
