package com.mycompany.socket_programming_in_java;


/* TODO 1: Import BufferedReader */
/* TODO 2: Import InputStreamReader */
/* TODO 3: Import PrintWriter */
/* TODO 4: Import ServerSocket */
/* TODO 5: Import Socket */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
        
import java.io.IOException;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        final int portNumber = 22222;

        // TODO 6: Create a try-with-resources block for ServerSocket on portNumber
        try (ServerSocket serverSocket = new ServerSocket(22222) ) {

            System.out.println("Server is listening on port " + portNumber);

            // TODO 7: Create an infinite loop to keep accepting clients
            while (true) {

                // TODO 8: Call accept() to wait for a connection
                Socket clientSocket = serverSocket.accept();

                System.out.println("Client connected: " + clientSocket.getInetAddress());

                // TODO 9: Initialize BufferedReader from clientSocket.getInputStream()
                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                // TODO 10: Initialize PrintWriter from clientSocket.getOutputStream() (autoFlush true)
                PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);

                // TODO 11: Read a single line of text from the client
                String clientMessage = input.readLine();

                System.out.println("Received from client: " + clientMessage);

                // TODO 12: Send "Hello from server" back to the client
                output.println("Hello from server");
                
                // TODO 13: Close the client Socket to release resources
                clientSocket.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
