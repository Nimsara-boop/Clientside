/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coursework1;

/**
 *
 * @author Nimsara
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Coursework1Resource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HelloResponse getHello() {
        HelloResponse hello = new HelloResponse("coursework 1 hiii");
        return hello;
    }

    static class HelloResponse { 
//Jersey’s JSON serializer (Jackson) 
//cannot properly serialize a non-static inner class, 
//because it requires an 
//implicit reference to the outer class instance.

        private String message;
        
        public HelloResponse() {}

        HelloResponse(String m) {
            this.message = m;
        }

        public void setMessage(String m) {
            this.message = m;
        }

        public String getMessage() {
            return this.message;
        }
    }

}
