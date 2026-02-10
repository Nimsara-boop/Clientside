/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial01message;

/**
 *
 * @author Nimsara
 */

import java.util.Scanner;

public class ExceptionExample {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        // Arithmetic Exception
        try{
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            System.out.println("Enter another number");
            int number2 = input.nextInt();
            
            int result = number/number2;
            System.out.println("Result of division is "+result);
        }
        catch (ArithmeticException e){
            System.out.println("Division by sero is not allowed");
        }
        catch (Exception e){
            System.out.println("Unexpected error occured");
            e.printStackTrace();
        }
        
        // ArrayIndexOutOfBoundsException
        try{
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Enter index to get correspoinding element from array");
            
            int index = input.nextInt();
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " +
            value);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of Bounds");
    }
        catch (Exception e){
            System.out.println("Unexpected error occred");
        }
        finally{
            input.close();
        }
    }
}
