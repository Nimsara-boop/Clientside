/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Nimsara
 */
public class EchoClient {

    public static void main(String[] args) {
        String host = "localhost";
        int port = 6666;
        
        try(
        Socket socket = new Socket(host, port);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));){
            
                out.println("Hellow Distributed System");
                String response = in.readLine();
                System.out.println("Server replied: "+response);
        
    
        }catch(IOException e){
            System.out.println("Connection refused");}
    }
}
