package org.sofkau.exercice1;

import lombok.Data;

@Data
public class Correo {
    private String correo;
    private Boolean enviado;

    public Correo(String correo, Boolean enviado) {
        this.correo = correo;
        this.enviado = enviado;
    }
}
