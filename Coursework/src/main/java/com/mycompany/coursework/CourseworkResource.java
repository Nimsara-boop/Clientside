/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coursework;

/**
 *
 * @author Nimsara
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class CourseworkResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public HelloResponse getHello() {
        HelloResponse hello = new HelloResponse("hiii");
        return hello;
    }

    class HelloResponse {

        private String message;

        public HelloResponse(String m) {
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
