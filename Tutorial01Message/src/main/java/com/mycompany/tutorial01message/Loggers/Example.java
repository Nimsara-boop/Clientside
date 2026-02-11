/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial01message.Loggers;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Nimsara
 */
public class Example {
    private static final Logger logger = Logger.getLogger(Example.class.getName());
    
    public static void main(String[] args) {
        // Create a console handler
        ConsoleHandler consoleHandler = new ConsoleHandler();
        
        // Set logging level for handler
        consoleHandler.setLevel(Level.ALL);
        
        // Add the handler to the logger
        logger.addHandler(consoleHandler);
        
        // Log messgaes
        logger.info("This is an informational message");
        logger.warning("this is a warning message");
        logger.severe("This is a severe message");
    }
}
