/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author loren
 */
public class Enfermero extends Sanitario{
    
    private int puesto;

    public Enfermero(int puesto, String dni, String nombre, double sueldoBase, int edad) {
        super(dni, nombre, sueldoBase, edad);
        this.puesto = puesto;
    }
    
    @Override
    public double calculaSueldo() {
        if (puesto==0)
            return super.getSueldoBase()+200;
        else
            return super.getSueldoBase();
    }

    @Override
    public void mostrar() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String puestos="";
        if (puesto==0)
            puestos="UCI";
                    else if (puesto==1)
                        puestos="Planta";
        return super.toString()+"\nPuesto: "+puestos+"\nSueldo total: "+calculaSueldo();
        
    }

    
    
    
    
}
