/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week3_socket_programming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Nimsara
 */
public class SimpleChatClient {
    
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(SimpleChatClient.class.getName());
        
        try{
            Socket socket = new Socket("localhost", 8000);
            System.out.println("Connected to the server");
            
            InputStream inputStream = socket.getInputStream();
            
            OutputStream outputStream = socket.getOutputStream();
            
            Scanner input = new Scanner(System.in);
            
            while(true){
                System.out.println("You: ");
                String message = input.nextLine();
                
                byte[] msg = message.getBytes();
                outputStream.write(msg);
                
                byte[] buffer = new byte[1024];
                int bytesRead = inputStream.read(buffer);
                
                String responseMessage = new String(buffer, 0 , bytesRead);
                
                System.out.println("Server: "+responseMessage);
            }
            
            
            
        }catch(IOException e){
            System.out.println("IOExcpetion");
        }
    }
    
}
