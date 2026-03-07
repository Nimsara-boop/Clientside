/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld1;

/**
 *
 * @author Nimsara
 */
public class User {
    private String id;
    private String name;
    private String email;
    
    public User(){}
    
    public User(String id, String n, String e){
        this.id=id;
        this.name=n;
        this.email=e;
    }
    
    public String getID(){return id;}
    public String getEmail(){return email;}
    public String getName(){return name;}
    
    public void setID(String i){this.id=i;}
    public void setName(String n){this.name= n;}
    public void setEmail(String e){this.email=e;}

    
}
