package org.academiadecodigo.nanderthals;

public class NotEnoughSpaceException extends FileException{

    public NotEnoughSpaceException(String warning3, int size) {
        super(warning3, size);
    }


}
