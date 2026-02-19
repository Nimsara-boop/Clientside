/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial_week04_questions;

/*
 * 5COSC022W.2 Client-Server Architectures
 * Week 04 Lab: Multi-threaded HTTP Server
 * * INSTRUCTIONS:
 * Follow the 40 Tasks in the Lab Tutorial PDF to implement this server.
 */

// -----------------------------------------------------------------
// Part 1: Imports and Core Setup
// -----------------------------------------------------------------

// TODO: Task 01: Import the HttpServer class from com.sun.net.httpserver
// TODO: Task 02: Import the HttpHandler interface
// TODO: Task 03: Import the HttpExchange class
// TODO: Task 04: Import java.io.IOException
// TODO: Task 05: Import java.io.OutputStream
// TODO: Task 06: Import java.net.InetSocketAddress
// TODO: Task 07: Import java.util.concurrent.Executors
// TODO: Task 08: Import java.util.concurrent.atomic.AtomicInteger

// (Note: You may need to add 'import java.io.InputStream;' for Part 5)

public class SimpleHttpServer {

    public static void main(String[] args) throws IOException {
        
        // TODO: Task 09: Define an integer variable 'port' and set it to 8000
        
        // TODO: Task 10: Create the HttpServer instance (HttpServer.create)
        // using new InetSocketAddress(port) and backlog 0.
        
        
        // -----------------------------------------------------------------
        // Part 2: Routing and Threading
        // -----------------------------------------------------------------
        
        // TODO: Task 11: Create a context for "/" and instantiate new RootHandler()
        
        // TODO: Task 12: Create a context for "/greet" and instantiate new GreetHandler()
        
        // TODO: Task 13: Create a context for "/echo" and instantiate new EchoHandler()
        
        // TODO: Task 14: Create a context for "/stats" and instantiate new StatsHandler()
        
        // TODO: Task 15: Call server.setExecutor(...)
        
        // TODO: Task 16: Pass Executors.newCachedThreadPool() into the executor setter
        
        // TODO: Task 17: Print "Server started on port 8000" to the console
        
        // TODO: Task 18: Call server.start() to begin listening
    }

    // -----------------------------------------------------------------
    // Part 3: The Root Handler
    // -----------------------------------------------------------------
    
    // TODO: Task 19: Create a static inner class named RootHandler that implements HttpHandler
    /*
    static class RootHandler implements HttpHandler {
        
        // TODO: Task 20: Override the handle method taking HttpExchange as a parameter
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            
            // TODO: Task 21: Define a String variable named 'response' containing "Server is online and running."
            
            // TODO: Task 22: Send response headers using exchange.sendResponseHeaders
            // TODO: Task 23: Use status code 200 and response.length() for the headers
            
            // TODO: Task 24: Open a try-with-resources block to get the output stream: exchange.getResponseBody()
            // try (OutputStream os = ...) {
                
                // TODO: Task 25: Write the response bytes using os.write(response.getBytes())
            
            // TODO: Task 26: Ensure the try block closes automatically
            // }
        }
    }
    */

    // -----------------------------------------------------------------
    // Part 4: The Greet Handler
    // -----------------------------------------------------------------
    
    // TODO: Task 27: Create the GreetHandler class implementing HttpHandler
    /*
    static class GreetHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            
            // TODO: Task 28: Get the query string using exchange.getRequestURI().getQuery()
            
            // TODO: Task 29: Initialize a String variable 'name' to "Stranger"
            
            // TODO: Task 30: Check if the query is not null
            
                // TODO: Task 31: Split the query string by the "&" character
                
                // TODO: Task 32: Loop through the split pairs and split each by "="
                
                // TODO: Task 33: If the key equals "name", update the 'name' variable
            
            
            // TODO: Task 34: Send headers (200) and write the response "Hello, [Name]!"
            
        }
    }
    */

    // -----------------------------------------------------------------
    // Part 5: Echo and Stats (POST & Concurrency)
    // -----------------------------------------------------------------

    // TODO: Task 35: Define EchoHandler. Inside handle, check if method is "POST"
    /*
    static class EchoHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
             // if (POST) {
                // TODO: Task 36: Read input stream (getRequestBody), convert to String, and write as response
             // } else {
                // TODO: Task 37: If NOT POST, send 405 Method Not Allowed
             // }
        }
    }
    */

    // TODO: Task 38: Define StatsHandler. Create a private final AtomicInteger requestCount = new AtomicInteger(0);
    /*
    static class StatsHandler implements HttpHandler {
        
        // (Field definition goes here)

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            
            // TODO: Task 39: Call requestCount.incrementAndGet()
            
            // TODO: Task 40: Write the response "Total requests: " + count
        }
    }
    */
}