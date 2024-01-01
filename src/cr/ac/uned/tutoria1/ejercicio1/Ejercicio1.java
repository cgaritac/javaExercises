/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uned.tutoria1.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DavidAlexander
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cual es su nombre ");
        
        String nombre = sc.nextLine();
        
        System.out.println("Cuales son sus apellidos");
        
        String apellido = sc.nextLine();
        
        System.out.println("Hola "+ nombre + " "+apellido);
    }
    
}
