package com.negrete.deyvis.logging;

/**
 * Created by usuario on 15/06/2016.
 */
public class CONTACTOS {
    private String id,nombre,telefono,valor;

    public CONTACTOS(String id, String nombre, String telefono,String valor) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.valor = valor;
    }

    public String getid() {return id;}

    public String getValor() {return valor;}

    public String getTelefono() {return telefono;}

    public String getNombre() {return nombre;}
}
