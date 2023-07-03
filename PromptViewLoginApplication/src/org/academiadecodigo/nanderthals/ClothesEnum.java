package org.academiadecodigo.nanderthals;

import java.awt.*;

public enum ClothesEnum {
    SHIRT(1, new Shirt()),
    JEANS(2, new Jeans()),
    SHORTS(3, new Shorts()),
    SKIRT(4, new Skirt()),
    DRESS(5, new Dress());

    private int choice;
    private Clothes clothes;

    ClothesEnum(int choice, Clothes clothes){
        this.choice = choice;
        this.clothes = clothes;
    }

    public static  Clothes getChoice(int choice){
        Clothes shirt = ClothesEnum.SHIRT.clothes;
        Clothes jeans = ClothesEnum.JEANS.clothes;
        Clothes shorts = ClothesEnum.SHORTS.clothes;
        Clothes skirt = ClothesEnum.SKIRT.clothes;
        Clothes dress = ClothesEnum.DRESS.clothes;
        return null ;
    }


}

