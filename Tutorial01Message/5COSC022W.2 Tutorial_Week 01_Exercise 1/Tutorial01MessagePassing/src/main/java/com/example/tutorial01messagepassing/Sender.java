/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tutorial01messagepassing;

// Sender class to create and send a message
public class Sender {
    public Message createMessage(String content) {
        Message message = new Message(content);
        System.out.println("Message created: " + content);
        return message;
    }

    public void sendMessage(Message message, Receiver receiver) {
        System.out.println("Sending message to receiver...");
        receiver.receiveMessage(message);
    }
}