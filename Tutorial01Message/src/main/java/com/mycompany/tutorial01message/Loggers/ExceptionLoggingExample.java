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
public class ExceptionLoggingExample {
    private static final Logger logger = Logger.getLogger(ExceptionLoggingExample.class.getName());
    
    public static void main (String[] args){
        try{
            throw new RuntimeException("This is a simeple exception");
        }catch(Exception e){
            logger.severe("An exception occured "+e.getMessage());
            logger.severe("Stack trace: ");
            for (StackTraceElement element : e.getStackTrace()){
                logger.severe(element.toString());}
        }
    }
    
}
