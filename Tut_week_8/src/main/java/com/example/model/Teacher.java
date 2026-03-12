/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

/**
 *
 * @author Nimsara
 */
public class Teacher implements BaseModel {
    private int id;
    private String name;
    
    public Teacher(){}
    
    public Teacher (int id, String name){
    this.id= id;
    this.name=name;}
    
    @Override
    public int getId(){return id;}
    
    @Override
    public void setId(int id){this.id=id;}
    
    public String getName(){ return name;}
    
    public void setName(String name){ this.name=name;}
    
}
