/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

import java.util.Scanner;

/**
 *
 * @author CCannon
 */
public class MyApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an input: ");
        int input = keyboard.nextInt();
        
        System.out.println(input * 5);

    }
    
}
