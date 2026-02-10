/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tutorial01messagepassing;

// Sender class to create and send a message
public class Sender {
    Message m;
    
    public void createMessage(String content) {
        m = new Message(content);
        System.out.println("Message created: " + content);
        this.sendMessage();
    }

    public void sendMessage() {
        System.out.println("Sending message to receiver...");
        Receiver r = new Receiver();
        r.receiveMessage(m);
    }
}