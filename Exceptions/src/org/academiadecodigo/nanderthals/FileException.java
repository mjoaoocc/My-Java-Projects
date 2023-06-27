package org.academiadecodigo.nanderthals;

public class FileException extends Exception {
    private String warning;
    private int size;

    public FileException(String warning, int size) {
        this.warning = warning;
        this.size = size;
    }

    public FileException(String warning) {
        this.warning = warning;
    }

    @Override
    public String getMessage() {
        return (warning + " " + size);
    }
}
