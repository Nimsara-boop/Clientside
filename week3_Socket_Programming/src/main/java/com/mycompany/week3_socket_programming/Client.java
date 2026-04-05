/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week3_socket_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Logger;

/**
 *
 * @author Nimsara
 */
public class Client {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Client.class.getName());
        final String serverAddress = "localhost";
        final int serverPort = 12345;
        
        try(Socket client = new Socket(serverAddress, serverPort)){
            PrintWriter output = new PrintWriter(client.getOutputStream(), true);
            BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
            output.println("Hello from client");
            
            String serverResponse = input.readLine();
            logger.info ("Recieved from server: "+serverResponse);
            
      }
        catch(IOException e){
            System.out.println("IOException");
        }
    }
    
}
