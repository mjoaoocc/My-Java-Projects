package org.academiadecodigo.bootcamp;


public class Sandbox {
    public static void main(String[] args) {
        Bank bankmj = new Bank();
        Wallet wallet = new Wallet(1000);
        Client client1 = new Client("Maria Joao", bankmj, wallet);

        client1.deposit(10);

        System.out.println(client1.balance());

    }
}