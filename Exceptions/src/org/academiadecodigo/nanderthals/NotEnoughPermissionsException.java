package org.academiadecodigo.nanderthals;

public class NotEnoughPermissionsException extends FileException{


    public NotEnoughPermissionsException(String warning1) {
        super(warning1);
    }
}
