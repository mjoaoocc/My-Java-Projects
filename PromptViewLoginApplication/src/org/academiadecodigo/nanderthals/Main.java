package org.academiadecodigo.nanderthals;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Login login = new Login();
        Menu menu = new Menu();
        Choice choice = new Choice();
        menu.Choice();
        ClothesEnum.getChoice(2).buyClothes();

    }
}
