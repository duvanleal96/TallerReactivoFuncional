package org.sofkau.exercice3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Integral {

    public String calcularIntegral(double cociente, double exponente){
        BiFunction<Double,Double,Double> result = (value, value1)->
            (value / (value1 + 1) == 1) ? 1.0 : value / (value1 + 1);
        Function<Double, Double> exponentResult = (expo) -> expo + 1;
    return "la integral de " + cociente + "X"+ exponente +" es "+ result.apply(cociente,exponente) + "X^" + exponentResult.apply(exponente);
    }
}
