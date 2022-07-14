package org.sofkau.exercice3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Derivada {
    public String calcularDerivada(double cociente, double exponente){

        BiFunction<Double,Double,Double> result = (value,value1)-> value*value1;

        Function<Double, Double> resultadoExponente = (value1) -> value1 - 1;

    return "la derivada de " + cociente + "X"+ exponente +" es "+ result.apply(cociente,exponente) + "X^" + resultadoExponente.apply(exponente);
    }
}
