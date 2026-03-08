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
import javax.ws.rs.core.Response;

@Path("/room")

public class RoomResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRoom(){
        String metadata="This is room";
    return Response.ok(metadata).build();
            }
    
    
    
}
