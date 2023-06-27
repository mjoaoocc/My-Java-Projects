package org.academiadecodigo.nanderthals;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    public static void main(String args[]) throws IOException{

        Socket clientSocket = new Socket("localhost", 8888);
        System.out.println("Connection made");

        PrintStream out = new PrintStream(clientSocket.getOutputStream(), true);
        //BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

    out.print("jegkjg");





        clientSocket.close();
    }
}
