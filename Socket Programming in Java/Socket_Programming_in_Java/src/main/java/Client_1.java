
/* TODO 14: Import necessary I/O classes (BufferedReader, InputStreamReader, PrintWriter) */
/* TODO 15: Import java.net.Socket */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client_1 {

    public static void main(String[] args) {

        final String serverAddress = "localhost";
        final int serverPort = 22222;
        Scanner input = new Scanner(System.in);

        // TODO 16: Open a socket connection to localhost:12345
        try (Socket socket = new Socket(serverAddress, serverPort)) {
            System.out.println("Wrte a message");
            String msg = input.nextLine();
            // TODO 17: Create PrintWriter for output
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            // TODO 18: Create BufferedReader for input
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // TODO 19: Send "Hello from client" to the server
            printWriter.println(msg);
            System.out.println("this is SOUT");
            // TODO 20: Read the response line from the server
            String serverResponse = bufferedReader.readLine();
            
            System.out.println("Received from server: " + serverResponse);

        } catch (IOException e) {
            System.out.println("");
        }
    }
}
