/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Nimsara
 */
public class EchoServer {
    public static void main(String[] args) {
        try{
        ServerSocket serverSocket = new ServerSocket(6666);
        System.out.println("Waiting for client");

        
        while (true){
            Socket clientSocket = serverSocket.accept();
            
            PrintWriter out= new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in  = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            
            String inputline;
            while ((inputline = in.readLine()) != null ) {
                    out.println( "Echo: "+inputline);
            }
        
        }
        }
        
        catch (Exception e){
            System.out.println("Problem!");
        }
    }
    
}
