package com.hitss.apppicmovil.models;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/**
 * Created by Tadeo Gonzalez on 03/01/2017.
 */

public class ElementTabMenu {

    private Drawable fondo;
    private Bitmap iconActive;
    private Bitmap iconInactive;
    private String nombreIcono;
    private String nombre;
    private boolean selected;

    public ElementTabMenu(){

    }

    public ElementTabMenu(String nombreIcono, String nombre){
        this.nombreIcono = nombreIcono;
        this.nombre = nombre;
    }

    public Drawable getFondo() {
        return fondo;
    }

    public void setFondo(Drawable fondo) {
        this.fondo = fondo;
    }

    public Bitmap getIconActive() {
        return iconActive;
    }

    public void setIconActive(Bitmap iconActive) {
        this.iconActive = iconActive;
    }

    public Bitmap getIconInactive() {
        return iconInactive;
    }

    public void setIconInactive(Bitmap iconInactive) {
        this.iconInactive = iconInactive;
    }

    public String getNombreIcono() {
        return nombreIcono;
    }

    public void setNombreIcono(String nombreIcono) {
        this.nombreIcono = nombreIcono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
