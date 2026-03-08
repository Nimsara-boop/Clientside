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
import java.util.List;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/rooms")

public class SensorRoomResource {
    private static int index =0;
    private static Map<String, Room> roomlinks = new HashMap<>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRoom() {
        if (roomlinks.isEmpty()){
          String reply = "No rooms added yet";
          return Response.ok(reply).build();
        }
        //String metadata = "This is room";
        return Response.ok(roomlinks.values()).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addRoom(Room room){
        index++;
        
        roomlinks.put(room.getID(), room);
        return Response.ok("Room created successfully").build();
    }
    
    
    
            
    
}
