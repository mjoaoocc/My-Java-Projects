package org.academiadecodigo.nanderthals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Server {


    public static void main(String args[]) throws IOException {
        int portNumber = 8888;

        ServerSocket serverSocket = new ServerSocket(8888);


        //PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);



        while(true) {
            Socket clientSocket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println(in.readLine());


            // serverSocket.close();
        }
    }
    }
