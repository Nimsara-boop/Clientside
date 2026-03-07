/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld1;

/**
 *
 * @author Nimsara
 */
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/* 
        ---------Excercise 1 -----------
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

}*/

/* ----Exercise 1 -----
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
*/

@Path("/hello")
public class HelloWorldResource {
    
    private static List<User> users;
    
    public static void main(String[] args) {
        users.add(new User("123", "Jin", "jin@gmail.com"));
        users.add(new User("123", "Jin", "jin@gmail.com"));
        users.add(new User("123", "Jin", "jin@gmail.com"));
    }

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