/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coursework1;

/**
 *
 * @author Nimsara
 */
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/rooms")

public class SensorRoomResource {
    private static int index =0;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRoom() {
        String metadata = "This is room";
        return Response.ok(metadata).build();
    }

    @POST
    public static void addRoom(String num){
        index++;
        String="ROOM"+index;
        Room R = new Room()
        Map<String, Object> rooms = new HashMap<>();
        rooms.put("room"+Room.getID(), "room"+{id});
        metadata.put("contact", "admin@example.com");
        
        Map<String, String> links = new HashMap<>();
        links.put("rooms", "/Coursework1/api/v1/rooms");
        metadata.put("collections", links);
            
    
    }
            
    
}
