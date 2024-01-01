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
public class Persona {

    private int alto;
    private int edad;
    private int anioNacimiento;
    private String colorPiel;
    private boolean camina;
    private String nacionalidad;
    private String numeroCedula;
    private String nombre;

    //Constructor vacio
    public Persona() {
        System.out.println("****** Persona creada con constructor vacio");
    }

    /*
     Constructor que recibe el nombre de la persona
     para establecerlo al inicio
     */
    public Persona(String nombre) {
        System.out.println("****** Persona creada con constructor con parametro");
        this.nombre = nombre;
    }

    //Accesores
    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getEdad() {
        calcularEdad();
        return edad;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isCamina() {
        return camina;
    }

    public void setCamina(boolean camina) {
        this.camina = camina;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    private void calcularEdad() {
        this.edad = 2018 - getAnioNacimiento();
    }
    
    public void describirPersona(){
        System.out.println("----------------- DATOS DE LA PERSONA ----------------");
        System.out.println("ALTO:   "+getAlto());
        System.out.println("EDAD:   "+getEdad());
        System.out.println("PIEL:   "+getColorPiel());
        System.out.println("CAMINA: "+isCamina());
        System.out.println("NCLDAD: "+getNacionalidad());
        System.out.println("CEDULA: "+getNumeroCedula());
        System.out.println("NOMBRE: "+getNombre());
    }
}
