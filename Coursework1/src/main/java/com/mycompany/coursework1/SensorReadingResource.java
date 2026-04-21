/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coursework1;

import static com.mycompany.coursework1.Status.UNRECORDED;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.core.Response;

/**
 *
 * @author Nimsara
 */
public class SensorReadingResource {
    private String sensorId;
    private ArrayList<Sensor> sensors = SensorResource.sensorList;
    private List<Sensor> sensorStatus = new ArrayList<>();

    public SensorReadingResource(String Id) {
        sensorId = Id;
    }
    
    @GET
    public Status fetchHistory(){
        for (Sensor s : sensors){
            if (s.getId()==this.sensorId){return s.getStatus();}
        }
        return UNRECORDED;
    }
    
    @POST
    public Response addNewReading(Status st){
        for (Sensor s : sensors){
            if (s.getId()==sensorId){
                s.setStatus(st);
                return Response.ok("status added").build();
            }
        }
        return Response.noContent().build();
    }
    
    
    
    
}
