package org.sofkau;

import org.sofkau.exercice1.Exercice1;
import org.sofkau.exercice2.Exercise2;
import org.sofkau.exercice3.Derivada;
import org.sofkau.exercice3.Integral;

public class Main {
    public static void main(String[] args) {
        Exercice1 ejercicio1 = new Exercice1();
        Exercise2 ejercicio2 = new Exercise2();
        Derivada ejercicio3 = new Derivada();
        Integral ejercicio = new Integral();
        /**
         * Ejercicio 1
         */
        System.out.println(ejercicio1.validarCondicionCorreo());
        System.out.println(ejercicio1.filtrarCorreoGmail());
        System.out.println(ejercicio1.filtrarCorreoOutlook());
        System.out.println(ejercicio1.filtrarCorreoHotmail());
        System.out.println(ejercicio1.correosPorTipoHotmail());
        System.out.println(ejercicio1.correosPorTipoGmail());
        System.out.println(ejercicio1.correosPorTipoOutlook());
        System.out.println(ejercicio1.envioCorreo("duv65@outlook.com"));

        /**
         * Ejercicio 2
         */
        ejercicio2.filtrarPalabra();

        /**
         * Ejercicio 3
         */
        System.out.println(ejercicio3.calcularDerivada(2.0,2.0));
        System.out.println(ejercicio.calcularIntegral(2.0,2.0));

    }
}