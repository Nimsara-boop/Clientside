/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basicclientserversockets;

import java.net.ConnectException;
import java.net.Socket;

/**
 *
 * @author Nimsara
 */
public class Client {
    public static void main(String[] args) {
            String host = "127.0.0.1";
            int port = 6666;
            
            try{
                Socket socket = new Socket(host, port);
            }catch(Exception e){
                System.err.println("Connection refused");
            }
    }

    
    
}
