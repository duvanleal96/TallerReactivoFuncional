package org.sofkau.exercice1;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
    public static List<Correo> getCorreos(){
        List<Correo> result = new ArrayList<Correo>();
        result.add(new Correo("duvanleal65@gmail.com",false));
        result.add(new Correo("duv65@outlook.com",false));
        result.add(new Correo("duvanleal65@hotmail.com",false));
        result.add(new Correo("duvanleal@gmail.com",false));
        result.add(new Correo("duvan6@gmail.com",false));
        result.add(new Correo("duvanleal65@hotmail.com",false));
        result.add(new Correo("adrianazemanate@hotmail.com",false));
    return result;
    }
}
