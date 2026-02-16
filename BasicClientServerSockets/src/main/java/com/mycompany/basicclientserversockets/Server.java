/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basicclientserversockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Nimsara
 */
public class Server {
    public static void main(String[] args) {
        try{
        ServerSocket serverSocket = new ServerSocket(6666);
        System.out.println("Waiting for client");
        Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected");
        }catch(IOException e){
            System.out.println("Problem!");
        }
    }
    
    
}
