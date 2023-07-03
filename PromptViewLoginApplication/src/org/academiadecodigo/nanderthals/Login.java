package org.academiadecodigo.nanderthals;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class Login {

    public Login(){
    Prompt prompt = new Prompt(System.in, System.out);

    StringInputScanner question1 = new StringInputScanner();
        question1.setMessage("Enter your username?");

    String username = prompt.getUserInput(question1);

    IntegerInputScanner question2 = new IntegerInputScanner();
        question2.setMessage("Enter your 4-digit pin?");

    int pin = prompt.getUserInput(question2);

        System.out.println("Login Successful " + username + "!");
        System.out.println("Welcome home, " + username + "!");

}
}
