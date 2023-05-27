package org.academiadecodigo.bootcamp;

public class Emilio {

    private String color;
    private String breed;
    private String body;

    public Emilio(String color, String breed, String body){
        this.color = color;
        this.breed = breed;
        this.body = body;
    }

    public String getColor(){
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public String getBody() {
        return body;
    }


    public void changeBody(String body){
        this.body = body;
    }

    public int moveArray(int[] array) {
        for (int j : array) {
            System.out.println("I just ran " + j + " meters");

        }

        return 0;
    }



}
