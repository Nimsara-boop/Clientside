/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week3_socket_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

/**
 *
 * @author Nimsara
 */
public class Server {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Server.class.getName());
        
        final int portNumber = 12345;
        
        try (ServerSocket server = new ServerSocket(portNumber)){
            System.out.println("Server is listening on port "+portNumber);
            
            while (true){
                Socket clientSocket = server.accept();
                logger.info ("Client connected on port 12345");
                
                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
               
                PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);
                
                String line = input.readLine();
                
                logger.info ("Recieved from client: "+line);
                
                output.println("Hellow from Server");
                clientSocket.close();
                
            }
            
        }catch (IOException e){
        }
    }
}
