/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nimsara
 */


public class UserProcessor implements Runnable {
    private UserValidation validator;
    private UserDataScore dataStore;
    private Object lock;
    private String name;
    private int age;
    
    public UserProcessor(String name, int age, UserDataScore ds, Object lock){
        this.name = name;
        this.age = age;
        this.dataStore = ds;
        this.lock = lock;
        this.validator = new UserValidation();
    }
    
    @Override
    public void run(){
        synchronized (lock){
            if (validator.isValidAge(age)){
                System.out.println("Processing...");
                dataStore.addUser(new User(name, age));
            }
            System.out.println("Invalid user");
        }
    }
    
    
}
