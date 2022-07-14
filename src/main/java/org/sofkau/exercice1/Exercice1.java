package org.sofkau.exercice1;


import java.util.List;
import java.util.stream.Collectors;

public class Exercice1 {
    List<Correo> correoList = DataUtil.getCorreos();

    /**
     * metodo eliminar correo repetido, busca en la lista de correos los repetidos y solo retorna uno se
     * implementa el .distinc()
     */
    public List<String> eliminarCorreoRepetido(){
            var lista=correoList.stream()
                .map(correo -> correo.getCorreo()).distinct()
                    .collect(Collectors.toList());
                return lista;
    }

    /**
     * filtra la lista de correos , los tipos outlook,hotmail y gmail
     */
    public List<String> filtrarCorreoOutlook() {
        var outlook = correoList.stream()
                .map(correo -> correo.getCorreo())
                .filter(a -> (a.contains("outlook")))
                .collect(Collectors.toList());
        return outlook;
    }
    public List<String> filtrarCorreoHotmail() {
        var hotmail = correoList.stream()
                .map(correo -> correo.getCorreo())
                .filter(b -> (b.contains("hotmail")))
                .collect(Collectors.toList());
        return hotmail;
    }
    public List<String> filtrarCorreoGmail() {
        var gmail = correoList.stream()
                .map(correo -> correo.getCorreo())
                .filter(c -> (c.contains("gmail")))
                .collect(Collectors.toList());
        return gmail;
    }

    /**
     * verifica en la lista de correos , si los correos son validos , retorna un true , si hay un correo
     * o mas invalidos retorna false
     */
    public Boolean validarCondicionCorreo(){
        Boolean validado = correoList.stream()
                .map(e-> e.getCorreo())
                .map(a->a.matches("^[a-zA-Z0-9_!#$%&'*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+\\.[A-Za-z]{2,4}"))
               .reduce((i,k)->i&k)
               .get();
       return validado;
    }

    /**
     * cuenta la cantidad de correos en la lista
     */
    public Long cantidadCorreos(){
       var conteo= correoList.stream()
                .map(e->e.getCorreo())
                .count();
       return conteo;
    }

    /**
     * consulta y cuenta en la lista los correos de tipo , hotmail, outlook y gmail
     * @return gmail, hotmail,outlook
     */
    public long correosPorTipoGmail(){
        var gmail = correoList.stream()
                .map(e->e.getCorreo())
                .filter(a->a.contains("gmail"))
                .count();
        return gmail;
    }
    public long correosPorTipoHotmail() {
        var hotmail = correoList.stream()
                .map(e -> e.getCorreo())
                .filter(a -> a.contains("hotmail"))
                .count();
        return hotmail;
    }
    public long correosPorTipoOutlook(){
        var outlook = correoList.stream()
                .map(e->e.getCorreo())
                .filter(a->a.contains("outlook"))
                .count();
     return outlook;
    }

    /**
     * busca en la lista si se envio algun correo , si es asi , cambia el estado
     * @return
     */
    public List<Correo> envioCorreo(String correo){
        List<Correo> dataUtils= DataUtil.getCorreos();
        List<Correo> newDatos = dataUtils.stream()
                .map(dato ->{
                    return dato.getCorreo().equals(correo)?
                            new Correo(dato.getCorreo(),Boolean.TRUE):
                            new Correo(dato.getCorreo(),dato.getEnviado());
                })
                .collect(Collectors.toList());
    return newDatos;
    }

}
