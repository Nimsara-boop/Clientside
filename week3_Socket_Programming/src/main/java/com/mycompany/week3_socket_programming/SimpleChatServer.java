/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week3_socket_programming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

/**
 *
 * @author Nimsara
 */
public class SimpleChatServer {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(SimpleChatServer.class.getName());
        
        try (ServerSocket server = new ServerSocket(8000)){
            System.out.println("Server is running and waiting for a client to connect");
            
            Socket clientSocket = server.accept();
            System.out.println("Client connected on "+clientSocket.getInetAddress());
            
            InputStream inputStr = clientSocket.getInputStream();
            
            OutputStream outputStr = clientSocket.getOutputStream();
            
            byte[] buffer = new byte[1024];
            
            int bytesRead;
            
            while((bytesRead=inputStr.read(buffer))!=-1){
                String message = new String(buffer, 0 , bytesRead);
                
                System.out.println("Client: "+message);
                
                String responseMessage="Server received your message "+message;
                
                outputStr.write(responseMessage.getBytes());            
            }
            clientSocket.close();
            server.close();
            
        
        }catch (IOException e){
            logger.info("IOException");}
    }
    
}
