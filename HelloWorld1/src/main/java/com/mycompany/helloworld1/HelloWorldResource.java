/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld1;

/**
 *
 * @author Nimsara
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public HelloResponse getHello() {
        HelloResponse hello = new HelloResponse("Hiiiii ");
        return hello;
    }

    static class HelloResponse {

        private String message;

        HelloResponse(String m) {
            message = m;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String m) {
            message = m;
        }
    }

}
