package org.academiadecodigo.nanderthals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {



    public static void main(String args[]) throws IOException{
        DatagramSocket clientSocket = new DatagramSocket();
        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];

        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

        InetAddress IPAddress = InetAddress.getByName("localhost");

        String sentence = inFromUser.readLine();
        sendData = sentence.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 8888);
        clientSocket.send(sendPacket);

        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);

        String modifiedSentence = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("FROM SERVER:" + modifiedSentence);
        clientSocket.close();
    }
}

