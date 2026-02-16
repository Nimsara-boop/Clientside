/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Nimsara
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserDataScore dataStore = new UserDataScore();
        List<Thread> threadList = new ArrayList<>();
        Object lock = new Object();
        
        boolean addMore = true;
        
        while (addMore){
            System.out.println("Enter Name: ");
            String name = input.next();
            System.out.println("Enter age: ");
            int age = input.nextInt();
            
            UserProcessor processor = new UserProcessor(name, age, dataStore, lock);
            Thread thread = new Thread(processor);
            threadList.add(thread);
            
            System.out.println("Add another? (true/false)");
            addMore = input.nextBoolean();
        }
        
        for (Thread t : threadList){
            //join(t);
        }
                  
             
    }
    
}
