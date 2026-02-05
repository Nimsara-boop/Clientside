/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nimsara
 */

import java.util.ArrayList;
import java.util.List;

public class UserDataScore {
    List<User> userList;
    
    public UserDataScore(){
        this.userList = new ArrayList<>();
    }
    
    public void addUser(User user){
        userList.add(user);
    }
    
    public List<User> getAllUsers(){
        return new ArrayList<>(userList);
    }
}
