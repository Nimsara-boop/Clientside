/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial01message;

/**
 *
 * @author Nimsara
 */
public class Sender {
    Message m;
    public void createMessage(String text){
        m = new Message(text);
        System.out.println("Message created");
        this.sendMessage();
    }
    
    public void sendMessage(){
        System.out.println("Message sent");
        Reciever r = new Reciever();
        r.recieveMessage(this.m);
    }
}
