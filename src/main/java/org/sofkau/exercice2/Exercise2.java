package org.sofkau.exercice2;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise2 {
    Scanner sc = new Scanner(System.in);
    List<Palabra> listData = Data.getPalabra();

    /**
     * metodo filtar las malas palabras por ***** , verifica en la lista con el validador .contains
     * si es true remplaza la palabra por **** de lo contrario retorna la palabra sin cambios
     */
   public void filtrarPalabra(){
       System.out.println("digite la frase ");
       String frase = sc.nextLine();
       var palabra = Arrays.stream(frase.split(" ")).collect(Collectors.toList());
       Flux.fromIterable(palabra)
               .map(e -> {
           if (listData.stream().map(k->k.getInsulto()).collect(Collectors.toList()).contains(e.toLowerCase())) {
               e = "****";
           }
           return e;
       }).subscribe(result-> System.out.print(result+" "));
   }
}
