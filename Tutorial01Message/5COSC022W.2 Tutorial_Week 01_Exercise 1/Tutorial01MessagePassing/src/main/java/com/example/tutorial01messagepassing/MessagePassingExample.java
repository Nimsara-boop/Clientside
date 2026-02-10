/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tutorial01messagepassing;

/**
 *
 * @author Hamed
 */
// Main class to demonstrate the message passing
public class MessagePassingExample {
    public static void main(String[] args) {
        // Create instances of Sender and Receiver
        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        // Sender creates a message
        Message message = sender.createMessage("Hello, Receiver!");

        // Sender sends the message to the Receiver
        sender.sendMessage(message, receiver);
    }
}
