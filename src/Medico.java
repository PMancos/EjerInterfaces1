/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author loren
 */
public class Medico extends Sanitario{
    private String espacialidad;
    private int numeroPacientes;

    public Medico(String espacialidad, int numeroPacientes, String dni, String nombre, double sueldoBase, int edad) {
        super(dni, nombre, sueldoBase, edad);
        this.espacialidad = espacialidad;
        this.numeroPacientes = numeroPacientes;
    }

    @Override
    public double calculaSueldo() {
        return super.getSueldoBase()+(numeroPacientes*1.20);
    }

    @Override
    public void mostrar() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString()+"\nEspecialidad: "+espacialidad+"\nNumero de pacientes: "+numeroPacientes+"\nSueldo total: "+calculaSueldo();
    }
    
    
    
    
    
    
}
