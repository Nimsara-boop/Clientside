/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coursework1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; 
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Nimsara
 */
@Path("/sensors/")
public class SensorResource {
    private ArrayList<Sensor> sensorList= new ArrayList<>();;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response checkRoomID(Sensor sensor) {
        if (!sensor.getRoomId().isEmpty()) {
            sensorList.add(sensor);
            return Response.ok("added the sensor successfully").build();
        } else {
            return Response.ok("No such room available to assign the sensor").build();
        }
      
    }
    
    @GET
    @Path("/{type}")
    public Response getSensors(
        @PathParam("type")
        SensorType type){
        boolean found=false;
        ArrayList<Sensor> filtered = new ArrayList<>();
        for (Sensor s : sensorList){
            if (s.getType().equals(type)){
                filtered.add(s);
                found=true;
            }
        }
        if (found==true){
        return Response.ok(filtered).build();}
        else return Response.ok("No such sensors found").build();
        
    }


    

}
