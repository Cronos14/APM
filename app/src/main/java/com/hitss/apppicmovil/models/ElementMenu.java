package com.hitss.apppicmovil.models;

import android.graphics.Bitmap;

/**
 * Created by Tadeo Gonzalez on 03/01/2017.
 */

public class ElementMenu {

    private int id;
    private Bitmap icono;
    private String nombre;
    private String nombreLocal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bitmap getIcono() {
        return icono;
    }

    public void setIcono(Bitmap icono) {
        this.icono = icono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }
}
