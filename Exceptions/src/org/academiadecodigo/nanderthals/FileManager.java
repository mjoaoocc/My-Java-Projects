package org.academiadecodigo.nanderthals;


public class FileManager {

    private boolean login;
    private File myFile;

    public FileManager(File myFile) {
        this.myFile = myFile;
    }

    public FileManager() {
    }

    public void login() {

        if (login == false) {
            login = true;
            System.out.println("You are logged in!");
            return;
        }
            System.out.println("You are already logged in you fucking bitch motherfuckeeeeeerrr!");
    }

    public void logout() {

        if(login == true) {
            login = false;
            System.out.println("Todaloooo motherfuckeeeer!");
            return;
        }
            System.out.println("You can't logout if you are not logged in...");
    }

    public File getMyFile(String fileNelson) throws NotEnoughPermissionsException, FileNotFoundException  {

        if (login == false) {

            throw new NotEnoughPermissionsException("You need to login to access any file Nelsons");
        }
        if( !fileNelson.equals(myFile.getName())   ){

            throw new FileNotFoundException("File not found. pilinhas pra ti");
        }
        return myFile;
    }

    public void createFile(String fileKevin) throws NotEnoughPermissionsException, NotEnoughSpaceException {

        if (login == false) {

            throw new NotEnoughPermissionsException("You need to login to create any file Kevins");
        }

        if (myFile.getSize() >= 1000) {

            throw new NotEnoughSpaceException("That's too big, stupid idiot (it won't fit!!!) It's this big: 8====D", myFile.getSize());
        }

    }


}
