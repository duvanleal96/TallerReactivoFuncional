package org.sofkau.exercice2;

import org.sofkau.exercice1.Correo;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Palabra> gePalabra(){
        List<Palabra> result = new ArrayList<Palabra>();
        result.add(new Palabra("puto"));
        result.add(new Palabra("idiota"));
        result.add(new Palabra("imbecil"));
        result.add(new Palabra("insecto"));
        result.add(new Palabra("marica"));
        result.add(new Palabra("gonorrea"));
        result.add(new Palabra("hijueputa"));

        return  result;
    }
}
