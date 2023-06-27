package org.academiadecodigo.nanderthals;

import java.io.*;
import java.net.InetAddress;


public class DNSResolver {
    public static void main(String[] args)

            throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Hostname? ");

        String hostUrl = br.readLine();

        InetAddress address1 = InetAddress.getByName(hostUrl);
        System.out.println("The host " + address1 + " is reachable: " + address1.isReachable(1000));
    }
}

