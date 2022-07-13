package org.sofkau;

import org.sofkau.exercice1.Excercice1;

public class Main {
    public static void main(String[] args) {
        Excercice1 ejercicio1 = new Excercice1();
       /* System.out.println(ejercicio1.validarCondicionCorreo());
        System.out.println(ejercicio1.filtrarCorreoGmail());
        System.out.println(ejercicio1.filtrarCorreoOutlook());
        System.out.println(ejercicio1.filtrarCorreoHotmail());
        System.out.println(ejercicio1.correosPorTipoHotmail());
        System.out.println(ejercicio1.correosPorTipoGmail());
        System.out.println(ejercicio1.correosPorTipoOutlook());*/
        System.out.println(ejercicio1.envioCorreo("duvanleal65@gmail.com"));

    }
}