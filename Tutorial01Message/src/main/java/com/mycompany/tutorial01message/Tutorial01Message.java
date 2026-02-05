/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tutorial01message;

/**
 *
 * @author Nimsara
 */
public class Tutorial01Message {

    public static void main(String[] args) {
        Reciever m = new Reciever();
        Sender s = new Sender();
        System.out.println("Hello World!");
        
        s.createMessage("Hi i am oblonsky");
    }
}
