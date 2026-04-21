/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coursework1;

/**
 *
 * @author Nimsara
 */
import java.util.List;
import java.util.ArrayList;

public class Room {

    private String id;
    private String name;
    private int capacity;
    private List<String> sensorsIds = new ArrayList<>();


    public Room() {
    }

    public Room(String id, String n, int c, List<String> sensorsIds) {
        this.id = id;
        name=n;
        capacity=c;
        this.sensorsIds = sensorsIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<String> getSensorsIds() {
        return sensorsIds;
    }

    public void setSensorsIds(List<String> sensorsIds) {
        this.sensorsIds = sensorsIds;
    }

    public void addSensorId(Sensor sensor){
        this.sensorsIds.add(sensor.getId());
    }
    
    public void setID(String id) {
        this.id = id;
    }

    public String getID() {
        return this.id;
    }
}
