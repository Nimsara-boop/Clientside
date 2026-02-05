/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nimsara
 */
public class User {
    private String name;
    private int age;
    
    public User(String name, int age){
    this.name = name;
    this.age = age;
    }
    
    @Override
    public String toString(){
        return "User {name = '+this.name+' age = '+this.age+'}";
    }
    
}
