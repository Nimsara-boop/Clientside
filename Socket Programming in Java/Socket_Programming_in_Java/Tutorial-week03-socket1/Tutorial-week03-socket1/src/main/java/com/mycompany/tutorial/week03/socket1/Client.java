package com.mycompany.tutorial.week03.socket1;

/* TODO 14: Import necessary I/O classes (BufferedReader, InputStreamReader, PrintWriter) */
/* TODO 15: Import java.net.Socket */
import java.io.IOException;

public class Client {

    public static void main(String[] args) {

        final String serverAddress = "localhost";
        final int serverPort = 12345;

        // TODO 16: Open a socket connection to localhost:12345
        try (/* Socket init */) {

            // TODO 17: Create PrintWriter for output
            
            // TODO 18: Create BufferedReader for input

            // TODO 19: Send "Hello from client" to the server

            // TODO 20: Read the response line from the server
            String serverResponse = /* code here */;

            System.out.println("Received from server: " + serverResponse);

        } catch (IOException e) {
            // TODO 21: Handle the IOException (print stack trace)
        }
    }
}
