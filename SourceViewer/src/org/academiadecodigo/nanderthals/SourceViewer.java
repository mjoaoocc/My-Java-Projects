package org.academiadecodigo.nanderthals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class SourceViewer {
    public static void main(String[] args) throws IOException {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter URL:");
        String userUrl = myObj.nextLine();  // Read user input
        System.out.println("User URL is: " + userUrl);  // Output user input
        getUrlContents(userUrl);
    }

    private static String getUrlContents(String theUrl) {
        String content = "";
        try {
            URL url = new URL(theUrl);
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("lkehnfkle");
                content += line + "\n";
                System.out.println(content);
            }
            bufferedReader.close();
        } catch(Exception e) {
            System.out.println("The url was invalid, please try again");
        }
        return content;
    }
}









        //String url = getUrl();



        /*public static String getUrl() {
            System.out.println("URL? ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
        }

            BufferedReader in = new BufferedReader(new InputStreamReader(getUrl.()));

            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        }
    }
}
*/