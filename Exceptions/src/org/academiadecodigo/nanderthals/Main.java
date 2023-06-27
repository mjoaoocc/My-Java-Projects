package org.academiadecodigo.nanderthals;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("jhffyhb", 1050);
        FileManager fileManager = new FileManager(file1);

        try{
            fileManager.login();
            fileManager.getMyFile("Nelson's Balls");

        } catch (NotEnoughPermissionsException e){
            System.out.println(e.getMessage());
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


        try{
            fileManager.login();
            fileManager.createFile("Kevin's flip flops ");
        } catch (NotEnoughPermissionsException e){
            System.out.println(e.getMessage());
        }catch (NotEnoughSpaceException e){
            System.out.println(e.getMessage());
        }


    }
}
