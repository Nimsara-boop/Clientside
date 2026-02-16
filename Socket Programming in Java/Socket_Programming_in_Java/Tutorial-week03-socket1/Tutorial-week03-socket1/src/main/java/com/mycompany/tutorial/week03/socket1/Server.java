package com.mycompany.tutorial.week03.socket1;

/* TODO 1: Import BufferedReader */
/* TODO 2: Import InputStreamReader */
/* TODO 3: Import PrintWriter */
/* TODO 4: Import ServerSocket */
/* TODO 5: Import Socket */
import java.io.IOException;

public class Server {

    public static void main(String[] args) {

        final int portNumber = 12345;

        // TODO 6: Create a try-with-resources block for ServerSocket on portNumber
        try (/* ServerSocket init */ ) {

            System.out.println("Server is listening on port " + portNumber);

            // TODO 7: Create an infinite loop to keep accepting clients
            while (true) {

                // TODO 8: Call accept() to wait for a connection
                Socket clientSocket = /* code here */;

                System.out.println("Client connected: " + clientSocket.getInetAddress());

                // TODO 9: Initialize BufferedReader from clientSocket.getInputStream()
                BufferedReader input = /* code here */;

                // TODO 10: Initialize PrintWriter from clientSocket.getOutputStream() (autoFlush true)
                PrintWriter output = /* code here */;

                // TODO 11: Read a single line of text from the client
                String clientMessage = /* code here */;

                System.out.println("Received from client: " + clientMessage);

                // TODO 12: Send "Hello from server" back to the client
                
                // TODO 13: Close the client Socket to release resources

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
