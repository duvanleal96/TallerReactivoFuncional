package org.sofkau.exercice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Excercice1 {
    List<Correo> correoList = DataUtil.getCorreos();
    public void eliminarCorreoRepetido(){
                correoList.stream()
                .map(correo -> correo.getCorreo()).distinct()
                .forEach(System.out::println);
    }
    public void filtrarCorreo(){
     var outlook=   correoList.stream()
                .map(correo -> correo.getCorreo())
                .filter(a-> (a.contains("outlook")))
                .collect(Collectors.toList());
     var hotmail =correoList.stream()
             .map(correo -> correo.getCorreo())
             .filter(b-> (b.contains("hotmail")))
             .collect(Collectors.toList());
     var gmail = correoList.stream()
             .map(correo -> correo.getCorreo())
             .filter(c-> (c.contains("gmail")))
             .collect(Collectors.toList());

        System.out.println("los correos outlook "+ outlook);
        System.out.println("los correos hotmail "+ hotmail);
        System.out.println("los correos gmail "+ gmail);
    }
    public void validarCondicionCorreo(){
       Boolean validado= correoList.stream()
                .map(e-> e.getCorreo())
                .map(a->a.matches("^[a-zA-Z0-9_!#$%&'*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+\\.[A-Za-z]{2,4}"))
               .reduce((i,k)->i&k)
               .get();
        System.out.println(validado);
    }
    public void cantidadCorreos(){
       var conteo= correoList.stream()
                .map(e->e.getCorreo())
                .count();
        System.out.println(conteo);
    }
    public void correosPorTipo(){
        
    }
}
