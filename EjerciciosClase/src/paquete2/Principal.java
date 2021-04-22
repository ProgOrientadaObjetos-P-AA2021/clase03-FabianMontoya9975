/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paquete2;

import paquete1.InstitucionEducativa;

/**
 * 
 * @author josef
 */
public class Principal {
    /* Un objeto de tipo InstitucionEducativa */
    
    public static void main(String[] args) {
        InstitucionEducativa ins1 = new InstitucionEducativa();
        ins1.establecerNombre("La Dolorosa");
        ins1.establecerTipoInstitucion("Fiscomisional");
        ins1.establecerNumeroAlumnos(4500);
        ins1.establecerNumeroDocentes(56);
        ins1.establecerNumeroSedes(1);
        System.out.printf("Nombre: %s\nTipo: %s\nAlumnos: %d\nDocentes: %d\n"
                + "Sedes: %d\n",
                ins1.obtenerNombre(),
                ins1.obtenerTipoInstitucion(),
                ins1.obtenerNumeroAlumnos(),
                ins1.obtenerNumeroDocentes(),
                ins1.obtenerNumeroSedes());
    }

}
