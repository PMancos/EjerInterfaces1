
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author loren
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<PersonalLaboral> lista = new ArrayList<>();

        Medico m1 = new Medico("Cabecera", 5, "123456789", "Loren", 1000, 80);
        Enfermero e1 = new Enfermero(1, "45623886m", "Jokin", 800, 20);
        Enfermero e2 = new Enfermero(0, "4568965h", "Irati", 800, 20);

        lista.add(e1);
        lista.add(m1);
        lista.add(e2);

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).mostrar();
            System.out.println("");
        }
        //Incremento el sueldo un 1%
        e1.setSueldoBase(e1.getSueldoBase() + (e1.getSueldoBase() / 100));
        m1.setSueldoBase(m1.getSueldoBase() + (m1.getSueldoBase() / 100));
        e2.setSueldoBase(e2.getSueldoBase() + (e2.getSueldoBase() / 100));

        System.out.println("Despues de incrementar el sueldo base en un 1%");
        System.out.println("-----------------------------------------------");
        System.out.println("");

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).mostrar();
            System.out.println("");
        }

        System.out.println("Los empleados que se pueden jubilar son:");
        System.out.println("-----------------------------------------");
        System.out.println("");

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).jubilable()) {
                lista.get(i).mostrar();
                System.out.println("");
            }
            
        }

    }

}
