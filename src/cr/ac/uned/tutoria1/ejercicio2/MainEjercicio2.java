/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uned.tutoria1.ejercicio2;

/**
 *
 * @author DavidAlexander
 */
public class MainEjercicio2 {
    
    public static void main(String[] args){
        Persona p = new Persona();
        p.setAlto(178);
        p.setAnioNacimiento(2012);
        p.setColorPiel("Blanco");
        p.setCamina(true);
        p.setNacionalidad("tico");
        p.setNumeroCedula("101110111");
        p.setNombre("ABCDEF GGGGG");
        
        
        Persona pa = new Persona("KLJDSDSD qeqwewew");
        pa.setAlto(195);
        pa.setAnioNacimiento(2004);
        pa.setColorPiel("Trigueno");
        pa.setCamina(false);
        pa.setNacionalidad("tico");
        pa.setNumeroCedula("202220222");
    
        p.describirPersona();
        System.out.println("\n");
        pa.describirPersona();
    }
    
}
