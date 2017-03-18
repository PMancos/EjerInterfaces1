/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author loren
 */
public abstract class Sanitario implements PersonalLaboral{
    
    private String dni;
    private String nombre;
    private double sueldoBase;
    private int edad;

    public Sanitario(String dni, String nombre, double sueldoBase, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.edad = edad;
    }
    
    @Override
    public void mostrar(){
        
    }

    @Override
    public boolean jubilable() {
        return (edad>=65);
    }

    @Override
    public String toString() {
        return "Dni: " + dni + "\nNombre: " + nombre + "\nSueldoBase=" + sueldoBase + "\nEdad=" + edad;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    
    
    
    
    
    
}
