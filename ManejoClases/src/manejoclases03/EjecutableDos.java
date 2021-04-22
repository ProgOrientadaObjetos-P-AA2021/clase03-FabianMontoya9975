/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

/**
 *
 * @author josef
 */
public class EjecutableDos {

    public static void main(String[] args) {

        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();

        h1.establecerNombre("Vaca Ortiz");
        h2.establecerNombre("Militar");
        h3.establecerNombre("Manuel IM");

        // System.out.printf("%s\n", h1.obtenerNombre());
        // h1.establecerNombre("Hospital Vaca Ortiz");
        // System.out.printf("%s\n", h1.obtenerNombre());
        
        System.out.printf("%s - %d - %.2f\n", h3.obtenerNombre(),
                h3.obtenerNumeroCamas(), h3.obtenerPresupuesto());

    }

}
