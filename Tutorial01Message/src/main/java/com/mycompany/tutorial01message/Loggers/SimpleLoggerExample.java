/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial01message.Loggers;
import java.util.logging.Logger;
/**
 *
 * @author Nimsara
 */
public class SimpleLoggerExample {
    private static final Logger logger = Logger.getLogger(SimpleLoggerExample.class.getName());
    
    public static void main(String[] args){
        logger.info("This is an information message");
        logger.warning("This is a warning message");
        logger.severe("This is a severe message");
    }
}
