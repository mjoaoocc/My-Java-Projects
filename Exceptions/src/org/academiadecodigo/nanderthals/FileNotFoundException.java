package org.academiadecodigo.nanderthals;

public class FileNotFoundException extends FileException{

    private String warning2;



    public FileNotFoundException(String warning2){
        super(warning2);
        this.warning2 = warning2;
    }


    @Override
    public String getMessage() {
        return warning2;
    }
}
